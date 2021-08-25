import SupplierDetails  from "./SupplierOverview"
import "./Supplier.css";

const SupplierList = ({suppliers}) => {

    const OrgsSuppliers = suppliers.map(supplier => {
        return(
            
                <div key={supplier.id}>
                    <SupplierDetails SupplierDetail={supplier}></SupplierDetails>
                </div>
           
        )
    })

    return(
        <>
            <ul>
                {OrgsSuppliers}
            </ul>
        </>
    )
}

export default SupplierList;