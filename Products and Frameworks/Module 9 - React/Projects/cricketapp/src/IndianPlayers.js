import React from 'react';

const IndianPlayers = () => {
    const indianPlayers = ["Sachin", "Dhoni", "Virat", "Rohit", "Yuvraj", "Raina"];
    const [p1, p2, p3, p4, p5, p6] = indianPlayers;

    const oddPlayers = [p1, p3, p5];
    const evenPlayers = [p2, p4, p6];

    const T20players = ["First Player", "Second Player", "Third Player"];
    const RanjiTrophy = ["Fourth Player", "Fifth Player", "Sixth Player"];
    const mergedPlayers = [...T20players, ...RanjiTrophy];

    return (
        <div>
            <h2>Odd Players</h2>
            <ul>
                {oddPlayers.map((name, index) => (
                    <li key={index}>First : {name}</li>
                ))}
            </ul>
            <h2>Even Players</h2>
            <ul>
                {evenPlayers.map((name, index) => (
                    <li key={index}>Second : {name}</li>
                ))}
            </ul>
            <hr />
            <h2>List of Indian Players Merged</h2>
            <ul>
                {mergedPlayers.map((name, index) => (
                    <li key={index}>Mr. {name}</li>
                ))}
            </ul>
        </div>
    );
};

export default IndianPlayers;
