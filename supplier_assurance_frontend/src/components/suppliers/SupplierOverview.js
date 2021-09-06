import "./Supplier.css";
import {Link} from 'react-router-dom';
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
                    <td><a href={SupplierDetail.website}>{SupplierDetail.website}</a></td>
                </tr>
            </tbody>
        </>
    )
}

export default SupplierDetails;