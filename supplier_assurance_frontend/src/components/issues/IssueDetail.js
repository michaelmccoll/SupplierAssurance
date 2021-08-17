import "./Issue.css";
import issue from "./Issues.png";

const IssueDetails = ({IssueDetail})=>{
    return(
        <>
            <div className="issue">
                <img className="issuePic" src={issue}></img><a className="issueName"><b>{IssueDetail.question.review.supplier.name}</b> <br/> {IssueDetail.issue}</a>
                <h4>Domain: {IssueDetail.question.domain}</h4>
                <h4>Question: {IssueDetail.question.question}</h4>
                <h4>Rating: {IssueDetail.question.rating}</h4>
                <h4>Date Raised: {IssueDetail.question.review.date}</h4>
                <h4>Target Date: {IssueDetail.targetDate}</h4>
                <h4>Status: {IssueDetail.status}</h4>
            </div>
        </>
    )
}

export default IssueDetails;