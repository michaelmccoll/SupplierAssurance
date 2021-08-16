import {useState} from 'react';
import React from 'react';
import SupplierList from "../components/suppliers/SupplierList"

const Suppliers = ({data})=>{

    const [OrgSuppliers]= useState(data[0].suppliers)

    return(
        <>
            <h1>Suppliers list...</h1>
            <table className="table">
                <thead>
                    <th>Supplier</th>
                    <th>Type</th>
                    <th>Tier</th>
                    <th>Last Review</th>
                    <th>Next Review</th>
                    <th>Review Progress</th>
                </thead>
            </table>
            <SupplierList suppliers={OrgSuppliers}/>
        </>
    )
}

export default Suppliers;