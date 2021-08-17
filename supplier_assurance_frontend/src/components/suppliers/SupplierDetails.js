import "./Supplier.css";

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
                    <td>{SupplierDetail.review[0].progress}</td>
                    <td></td>
                </tr>
            </tbody>
        </>
    )
}

export default SupplierDetails;