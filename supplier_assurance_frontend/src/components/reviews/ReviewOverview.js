import "./Review.css";
import {useState} from 'react';

const ReviewDetails = ({ReviewDetail})=>{

    return(
        <>
            <tbody >
                <tr>
                    <td>{ReviewDetail.supplier.name}</td>
                    <td>{ReviewDetail.type}</td>
                    <td>{ReviewDetail.date}</td>
                    <td>{ReviewDetail.progress}</td>
                    {/* <td>{ReviewDetail.triageQuestions[0].triageDomain}:{ReviewDetail.triageQuestions[0].triageAnswer}</td> */}
                </tr>
            </tbody>
        </>
    )
}

export default ReviewDetails;