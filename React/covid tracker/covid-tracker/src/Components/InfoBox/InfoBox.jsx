import React from "react";
import { Card, CardContent, Typography } from "@mui/material";
import "./InfoBox.css";

function InfoBox({ title, cases, total, active, isRed, ...props }) {
  console.log(title, active);
  return (
    <Card
    //Setting on click event to props
      onClick={props.onClick}
    //if active, set to the selected
    className={`infoBox ${active && "infoBox--selected"} ${
      isRed && "infoBox--red"
    }`}
    >
      <CardContent>
        {/* Title I.E. Coronavirus */}
        <Typography className="infoBox__title" color="textSecondary" gutterBottom>
          {title}
        </Typography>
        {/* 120K Number of Cases */}
        <h2 className={`infoBox__cases ${!isRed && "infoBox__cases--green"}`}>
          {cases}
        </h2>

        {/* 1.2M Total */}
        <Typography className="infoBox__total" color="textSecondary">
          {total} Total
        </Typography>
      </CardContent>
    </Card>
  );
}

export default InfoBox;