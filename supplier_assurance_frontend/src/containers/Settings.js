import AddAssessor from '../components/assessors/AddAssessor';
import AddSupplier from '../components/suppliers/AddSupplier';
import AddTriage from '../components/triage/AddTriage';

const Settings = ({data})=>{
  
    return(
        <>
            <AddSupplier data={data}/>
            <AddAssessor data={data}/>
            {/* <AddTriage data={data}/> */}
        </>
    )
}
export default Settings;