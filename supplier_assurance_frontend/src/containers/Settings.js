import AddAssessor from '../components/assessors/AddAssessor';
import AddSupplier from '../components/suppliers/AddSupplier';

const Settings = ({data})=>{
  
    return(
        <>
            <AddSupplier data={data}/>
            <AddAssessor data={data}/>
            <br></br>
            <h3>New Review</h3>
            <button>New Review</button>
        </>
    )
}
export default Settings;