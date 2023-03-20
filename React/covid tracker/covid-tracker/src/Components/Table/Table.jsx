import React from 'react'
import numeral from 'numeral';
import "./Table.css";


function Table({countries}) {
  return (
    //Fetch country and cases and put them into table
    
    <div className="table">
        <table>
            <tbody>
              {countries.map((country) => (
                <tr>
                    <td>{country.country}</td>
                    <td>
                    <strong>{numeral(country.cases).format("0,0")}</strong>
                    </td>
                </tr>
                ))}     
            </tbody>
        </table>
   
  </div>
);
}

export default Table