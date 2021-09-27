import "./Issue.css";
import issue from "./Issues.png";

const IssueDetails = ({IssueDetail})=>{
    return(
        <>
            <div className="issueContainer">
                <img className="issuePic" src={issue}></img>
                <h3 className="supplierName">{IssueDetail.question.review.supplier.name}</h3>
                <h4 className="issue">Issue: {IssueDetail.issue}</h4>
                <h4 className="domain">Domain: {IssueDetail.question.domain}</h4>
                <h4 className="question">Question: {IssueDetail.question.question}</h4>
                <h4 className="rating">Rating: {IssueDetail.question.rating}</h4>
                <h4 className="dateRaised">Date Raised: {IssueDetail.question.review.date}</h4>
                <h4 className="targetDate">Target Date: {IssueDetail.targetDate}</h4>
                <h4 className="status">Status: {IssueDetail.status}</h4>
            </div>
        </>
    )
}

export default IssueDetails;