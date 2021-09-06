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
                    <td>ICON</td>
                </tr>
            </tbody>
        </>
    )
}

export default ReviewDetails;