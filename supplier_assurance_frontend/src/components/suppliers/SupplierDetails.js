import Suppliers from "../../containers/Suppliers";

const SupplierDetails = ({SupplierDetail})=>{
    return(
        <>
            <tbody>
                <tr>
                    <td>{SupplierDetail.name}</td>
                    <td>{SupplierDetail.type}</td>
                    <td>{SupplierDetail.tier}</td>
                    <td>{SupplierDetail.lastReviewDate}</td>
                    <td>{SupplierDetail.nextReviewDate}</td>
                    <td>{SupplierDetail.lastReviewDate.progress}</td>
                </tr>
            </tbody>
        </>
    )
}

export default SupplierDetails;