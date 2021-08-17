import AssessorDetails from "./AssessorDetails"
import "./Assessor.css";

const AssessorList = ({assessors})=>{

    const OrgAssessors = assessors.map(assessor =>{
        return(
            <div className="display" key={assessor.id}>
                <AssessorDetails AssessorDetail={assessor}></AssessorDetails>
            </div>
        )
    })

    return(
        <>
            <ul>
                {OrgAssessors}
            </ul>
        </>
    )
}

export default AssessorList;