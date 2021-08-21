import AddAssessor from '../components/assessors/AddAssessor';
import AddSupplier from '../components/suppliers/AddSupplier';

const Settings = ({data})=>{
  
    return(
        <>
            <AddSupplier data={data}/>
            <AddAssessor data={data}/>
        </>
    )
}
export default Settings;