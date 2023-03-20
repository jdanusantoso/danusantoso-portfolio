import React, {useState, useEffect} from 'react';
import "./App.css";
import {
  MenuItem,
  FormControl,
  Select,
  Card,
  CardContent,
} from "@mui/material";
import InfoBox from './Components/InfoBox/InfoBox';
import Map from './Components/Map/Map';
import { sortData, prettyPrintStat } from './Components/Utils/Util';
import numeral from "numeral";
import LineGraph from './Components/LineGraph/LineGraph';
import Table from './Components/Table/Table';
//if not show only leaflet word
import "leaflet/dist/leaflet.css";


const App = () => {

  const [country, setInputCountry] = useState("worldwide");
  const [countryInfo, setCountryInfo] = useState({});
  const [countries, setCountries] = useState([]);
  //to store mapped countries
  const [mapCountries, setMapCountries] = useState([]);
  // const [country, setCountry] = useState("worldwide");
  const [tableData, setTableData] = useState([]);
  const [casesType, setCasesType] =useState('cases');
  //lat and long center of the world
  const [mapCenter, setMapCenter] = useState({ lat: 34.80746, lng: -40.4796 });
  //zoom to the point that you are able to see the whole map
  const [mapZoom, setMapZoom] = useState(3);
  
  

    useEffect(() => {
    fetch("https://disease.sh/v3/covid-19/all")
      .then((response) => response.json())
      .then((data) => {
        setCountryInfo(data);
      });
  }, []);

  useEffect(() => {
    const getCountriesData = async () => {

      fetch("https://disease.sh/v3/covid-19/countries")
      .then((response) => response.json())
      .then((data) => {
        const countries = data.map((country) => ({
          name: country.country,
          value: country.countryInfo.iso2,
        }));
        //sort data
        let sortedData = sortData(data);
          setCountries(countries);
          setMapCountries(data);
          setTableData(sortedData);
        });
   }; 

   getCountriesData();

  }, []);

  console.log(casesType);


  const onCountryChange = async (event) => {
    const countryCode = event.target.value;

    // setCountry(countryCode);

    const url =

    countryCode === "worldwide"
        ? "https://disease.sh/v3/covid-19/all"
        : `https://disease.sh/v3/covid-19/countries/${countryCode}`;
    
    await fetch(url)
      .then((response) => response.json()).then((data) => {
        setInputCountry(countryCode);
        setCountryInfo(data);
        //to zoom in a certain location
        setMapCenter([data.countryInfo.lat, data.countryInfo.long]);
        setMapZoom(4);
      });
  };

    

  return (
    <div className="app">
      <div className='app__left'>
      <div className="app__header">
        <h1>Building a covid tracker</h1>
        <FormControl className="app__dropdown">
            <Select
              variant="outlined"
              value={country}
              onChange={onCountryChange}
            >
            <MenuItem value="worldwide">Worldwide</MenuItem>
            {countries.map((country) => (
              <MenuItem value={country.value}>{country.name}</MenuItem>
            ))}
            </Select>
            </FormControl>
        </div>
        
    
  
    <div className="app__stats">
    {/*Infoboxs title="Coronavirus Cases" */}
    <InfoBox title="Coronavirus Cases" 
      //if it is red
      isRed
      active={casesType === "cases"}
      onClick={e => setCasesType('cases')}
      cases={prettyPrintStat(countryInfo.todayCases)}
      //shows zero while loading
      total={numeral(countryInfo.cases).format("0.0a")}
    />
    {/*Infoboxs title="Coronavirus Recoveries" */}
    <InfoBox title="Recovered" 
      active={casesType === "recovered"}
      onClick={e => setCasesType('recovered')}
      cases={prettyPrintStat(countryInfo.todayRecovered)}
      total={numeral(countryInfo.recovered).format("0.0a")}
    />
    {/*Infoboxs title="Coronavirus Cases" */}
    <InfoBox title="Deaths" 
      //if it is red
      isRed
      active={casesType === "deaths"}
      onClick={e => setCasesType('deaths')}
      cases={prettyPrintStat(countryInfo.todayDeaths)}
      total={numeral(countryInfo.deaths).format("0.0a")}
    />
    </div>

    

    {/* Map 
    passing the values to map component 
    so that it renders on page*/}
      <Map 
      onClick={casesType}
      countries={mapCountries}
      center={mapCenter}
      zoom = {mapZoom}
      />
      </div>
      
      <Card className="app__right">
        <CardContent>
          <div className="app__information">
            <h3>Live Cases by Country</h3>
            <Table countries={tableData} />
            <h3>Worldwide new {casesType}</h3>
            <LineGraph casesType={casesType} />
          </div>
        </CardContent>
      </Card>
    </div>
  );
};

export default App;
