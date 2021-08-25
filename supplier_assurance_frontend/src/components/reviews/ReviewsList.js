import ReviewDetails  from "./ReviewOverview"
import "./Review.css";

const ReviewList = ({reviews}) => {

    const OrgsReviews = reviews.map(review => {
        return(
            
                <div key={review.id}>
                    <ReviewDetails ReviewDetail={review}></ReviewDetails>
                </div>
           
        )
    })

    return(
        <>
            <ul>
                {OrgsReviews}
            </ul>
        </>
    )
}

export default ReviewList;