import {useState} from 'react';
import React from 'react';
import SupplierList from "../components/suppliers/SupplierList"
import "../components/suppliers/Supplier.css";

const Suppliers = ({data})=>{

    const [OrgSuppliers]= useState(data[0].suppliers)

    return(
        <>
            <h2>Suppliers</h2>
            <table className="table">
                <thead>
                    <th>Supplier</th>
                    <th>Type</th>
                    <th>Tier</th>
                    <th>Last Review</th>
                    <th>Next Review</th>
                    <th>Supplier Detail</th>
                </thead>
            </table>
            <SupplierList suppliers={OrgSuppliers}/>
        </>
    )
}

export default Suppliers;