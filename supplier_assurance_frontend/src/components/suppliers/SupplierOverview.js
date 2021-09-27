import "./Supplier.css";
import {Link} from 'react-router-dom';
import {useState} from 'react';
import SupplierInfo from "./SupplierInfo";

const SupplierDetails = ({SupplierDetail})=>{

    return(
        <>
            <tbody >
                <tr>
                    {/* <Link to={`/suppliers/${SupplierDetail.id}`}><SupplierInfo Info={SupplierDetail}>{SupplierDetail.name}</SupplierInfo></Link> */}
                    <td>{SupplierDetail.name}</td>
                    <td>{SupplierDetail.type}</td>
                    <td>{SupplierDetail.tier}</td>
                    <td>{SupplierDetail.lastReviewDate}</td>
                    <td>{SupplierDetail.nextReviewDate}</td>
                    <td><a href={`https://${SupplierDetail.website}`}>{SupplierDetail.website}</a></td>
                </tr>
            </tbody>
        </>
    )
}

export default SupplierDetails;