import "./Review.css";
import {useState} from 'react';
import { render } from "@testing-library/react";

const ReviewDetails = ({ReviewDetail})=>{

    return(
        <>
            <tbody >
                <tr>
                    <td>{ReviewDetail.supplier.name}</td>
                    <td>{ReviewDetail.type}</td>
                    <td>{ReviewDetail.date}</td>
                    <td>{ReviewDetail.progress}</td>
                    <td>{ReviewDetail.triageQuestions.length}</td>
                    <td>{ReviewDetail.questions.length}</td>
                </tr>
            </tbody>
        </>
    )
}

export default ReviewDetails;