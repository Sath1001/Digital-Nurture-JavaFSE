import React, { Component } from 'react';
import Cart from './Cart';

class OnlineShopping extends Component {
    render() {
        const CartInfo = [
            { itemname: "Laptop", price: 80000 },
            { itemname: "TV", price: 120000 },
            { itemname: "Washing Machine", price: 50000 },
            { itemname: "Mobile", price: 30000 },
            { itemname: "Fridge", price: 70000 }
        ];

        return (
            <div className="mycart">
                <h1>Items Ordered :</h1>
                <table border="1" cellPadding="10">
                    <thead>
                        <tr>
                            <th>Name</th>
                            <th>Price</th>
                        </tr>
                    </thead>
                    <tbody>
                        {CartInfo.map((item, index) => (
                            <Cart key={index} itemname={item.itemname} price={item.price} />
                        ))}
                    </tbody>
                </table>
            </div>
        );
    }
}

export default OnlineShopping;
