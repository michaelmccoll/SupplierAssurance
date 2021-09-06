import ReviewOverview  from "./ReviewOverview"
import "./Review.css";

const ReviewList = ({reviews}) => {

    const OrgsReviews = reviews.map(review => {
        return(
            
                <div key={review.id}>
                    <ReviewOverview ReviewDetail={review}></ReviewOverview>
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