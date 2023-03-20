import React, { useEffect, useState } from 'react'
import {Line} from "react-chartjs-2";
import numeral from "numeral";

const options = {
    legend: {
      display: false,
    },
    elements: {
      point: {
        radius: 0,
      },
    },
    maintainAspectRatio: false,
    tooltips: {
      mode: "index",
      intersect: false,
      callbacks: {
        label: function (tooltipItem, data) {
          return numeral(tooltipItem.value).format("+0,0");
        },
      },
    },
    scales: {
      xAxes: [
        {
          type: "time",
          time: {
            format: "MM/DD/YY",
            tooltipFormat: "ll",
          },
        },
      ],
      yAxes: [
        {
          gridLines: {
            display: false,
          },
          ticks: {
            // Include a dollar sign in the ticks
            callback: function (value, index, values) {
              return numeral(value).format("0a");
            },
          },
        },
      ],
    },
  };
  

function LineGraph({casesType}) {

    //{} empty object
    const [data, setData] = useState({});

    const buildChartData = (data, casesType ='cases') => {
        //Declare chart data as empty array
        const chartData = [];
        //declare last data point
        let lastDataPoint;
        //for each date in each case type, 
        for(let date in data.cases){
        // data[casesType].forEach(date => {
          if(lastDataPoint) {
            //set the new data point
            const newDataPoint = {
              x: date,
              //dae minus the last data point
              y: data[casesType][date] - lastDataPoint
            }
            //pushing new data point
            chartData.push(newDataPoint);
          }
          // declaring the last data point
          lastDataPoint = data[casesType][date];
        }
        //return chart data
        return chartData;
      };

    useEffect(() => {
        const fetchData = async () => {
        await fetch("https://disease.sh/v3/covid-19/historical/all?lastdays=120")
        .then((response) => response.json())
        .then((data) => {
            const chartData = buildChartData(data);
            setData(chartData);
        });  
    };

    fetchData();
       
    }, [casesType]);

    return (
        <div>
            {/* Check if the data exists */}
          {data?.length > 0 && (
            <Line
            //Data takes info in the form of datasets
              data={{
                //datasets empty array
                datasets: [
                    //stylizing
                  {
                    backgroundColor: "rgba(204, 16, 52, 0.5)",
                    borderColor: "#CC1034",
                    data: data,
                  },
                ],
              }}
              options={options}
            />
          )}
        </div>
      );
    }
    
export default LineGraph