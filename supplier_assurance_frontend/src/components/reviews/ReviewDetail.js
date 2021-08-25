import "./Review.css";
import review from "./Review.png";

const Review = ({reviews})=>{
    
    return(
        <>
            <div className="reviewSummary">
                <img className="reviewPic" src={review}></img><a className="reviewTitle"><b>{reviews.supplier.name}</b> <br/> {reviews.type}</a>
                <h4>Date: {reviews.date}</h4>
                <h4>Progress: {reviews.progress}</h4>
            </div>
        </>
    )
}

export default Review;