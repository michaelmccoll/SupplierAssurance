import SupplierDetails  from "./SupplierDetails"

const SupplierList = ({suppliers}) => {

    const OrgsSuppliers = suppliers.map(supplier => {
        return(
            <li key={supplier.id}>
                <div>
                    <SupplierDetails SupplierDetail={supplier}></SupplierDetails>
                </div>
            </li>
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