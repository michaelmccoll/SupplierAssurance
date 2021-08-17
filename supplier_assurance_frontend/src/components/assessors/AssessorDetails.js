import "./Assessor.css";
import assessor from "./Assessor.png";

const AssessorDetails = ({AssessorDetail})=>{
    return(
        <>
            <div className="assessor">
                <img className="assessorPic" src={assessor}></img><a className="assessorName"><b>{AssessorDetail.name}</b> <br/> {AssessorDetail.role}</a>
                <h4>Phone Num: {AssessorDetail.phoneNumber}</h4>
                <h4>Email: {AssessorDetail.email}</h4>
            </div>
        </>
    )
}

export default AssessorDetails;