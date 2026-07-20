import React from 'react';

const ListofPlayers = () => {
    const players = [
        { name: "Jack", score: 50 },
        { name: "Michael", score: 70 },
        { name: "John", score: 40 },
        { name: "Ann", score: 61 },
        { name: "Elisabeth", score: 61 },
        { name: "Sachin", score: 95 },
        { name: "Dhoni", score: 100 },
        { name: "Virat", score: 84 },
        { name: "Rohit", score: 75 },
        { name: "Yuvraj", score: 68 },
        { name: "Raina", score: 65 }
    ];

    const lowScorePlayers = players.filter(player => player.score <= 70);

    return (
        <div>
            <h2>List of Players</h2>
            <ul>
                {players.map((p, index) => (
                    <li key={index}>Mr. {p.name} {p.score}</li>
                ))}
            </ul>
            <hr />
            <h2>List of Players having score less than 70</h2>
            <ul>
                {lowScorePlayers.map((p, index) => (
                    <li key={index}>Mr. {p.name} {p.score}</li>
                ))}
            </ul>
        </div>
    );
};

export default ListofPlayers;
