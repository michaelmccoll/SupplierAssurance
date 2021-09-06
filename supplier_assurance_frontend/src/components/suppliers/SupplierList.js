import SupplierOverview  from "./SupplierOverview"
import "./Supplier.css";

const SupplierList = ({suppliers}) => {

    const OrgsSuppliers = suppliers.map(supplier => {
        return(
            
                <div key={supplier.id}>
                    <SupplierOverview SupplierDetail={supplier}></SupplierOverview>
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