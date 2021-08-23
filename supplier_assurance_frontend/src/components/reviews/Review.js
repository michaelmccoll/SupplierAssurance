import "./Review.css";
import review from "./Review.png";

const Review = ({Review})=>{
    return(
        <>
            <div className="reviewSummary">
                <img className="reviewPic" src={review}></img><a className="reviewTitle"><b>{Review.supplier.name}</b> <br/> {Review.type}</a>
                <h4>Date: {Review.date}</h4>
                <h4>Progress: {Review.progress}</h4>
            </div>
        </>
    )
}

export default Review;