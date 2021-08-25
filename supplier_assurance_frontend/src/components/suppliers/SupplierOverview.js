import "./Supplier.css";
import {useState} from 'react';
import SupplierDetail from "./SupplierDetail";

const SupplierDetails = ({SupplierDetail})=>{

    return(
        <>
            <tbody >
                <tr>
                    <td>{SupplierDetail.name}</td>
                    <td>{SupplierDetail.type}</td>
                    <td>{SupplierDetail.tier}</td>
                    <td>{SupplierDetail.lastReviewDate}</td>
                    <td>{SupplierDetail.nextReviewDate}</td>
                    {/* <SupplierDetail SupplierDetail={SupplierDetail}/> */}
                </tr>
            </tbody>
        </>
    )
}

export default SupplierDetails;