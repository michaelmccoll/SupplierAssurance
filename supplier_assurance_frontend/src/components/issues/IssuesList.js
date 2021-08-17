import IssueDetail from "./IssueDetail"
import "./Issue.css";

const IssueList = ({issues})=>{

    const OrgIssues = issues.map(issue =>{
        return(
            <div className="display" key={issue.id}>
                <IssueDetail IssueDetail={issue}></IssueDetail>
            </div>
        )
    })

    return(
        <>
            <ul>
                {OrgIssues}
            </ul>
        </>
    )
}

export default IssueList;