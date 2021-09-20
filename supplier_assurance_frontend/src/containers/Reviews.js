import {useState} from 'react';
import React from 'react';
import ReviewsList from "../components/reviews/ReviewsList"
import "../components/reviews/Review.css";

const Reviews = ({reviews,ReviewsLoaded})=>{

    const [OrgReviews]= useState(reviews)

    if(!ReviewsLoaded) {
        return(
            <p>...loading</p>
        )
    }

    return(
        <>
            <h2>Reviews</h2>
            <table className="table">
                <thead>
                    <th>Supplier Name</th>
                    <th>Type</th>
                    <th>Date</th>
                    <th>Progress</th>
                    <th>Triage</th>
                    <th>Review</th>
                </thead>
            </table>
            <ReviewsList reviews={OrgReviews}/>
        </>
    )
}

export default Reviews;