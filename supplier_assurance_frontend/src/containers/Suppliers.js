import {useState} from 'react';
import React from 'react';

const Suppliers = ({data})=>{

    return(
        <>
            <h1>Suppliers PAGE</h1>
            <h2>{data[0].name}</h2>
        </>
    )
}

export default Suppliers;