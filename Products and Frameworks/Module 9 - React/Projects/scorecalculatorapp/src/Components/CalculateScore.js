import React from 'react';
import '../Stylesheets/mystyle.css';

export const CalculateScore = ({ Name, School, Total, goal }) => {
    const average = (Total / goal).toFixed(2);
    return (
        <div className="formatstyle">
            <h1><font color="brown">Student Details:</font></h1>
            <div className="Name">
                <b><span>Name: </span></b>
                <span>{Name}</span>
            </div>
            <div className="School">
                <b><span>School: </span></b>
                <span>{School}</span>
            </div>
            <div className="Total">
                <b><span>Total: </span></b>
                <span>{Total}</span>
            </div>
            <div className="Score">
                <b><span>Average Score: </span></b>
                <span>{average}</span>
            </div>
        </div>
    );
};
