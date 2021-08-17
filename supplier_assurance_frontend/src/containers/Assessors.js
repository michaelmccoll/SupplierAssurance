import {useState} from 'react';
import React from 'react';

const Assessors = ({data})=>{

    const [OrgAssessors]= useState(data[0].assessors[0])

    // Need to structure the same as the Suppliers

    return(
        <>
            <h2>Assessors</h2>
            <table className="table">
                <thead>
                    <th>Assessor</th>
                    <th>Role</th>
                    <th>Phone Number</th>
                    <th>Email</th>
                </thead>
            </table>

            <tbody >
                <tr>
                    <td>{OrgAssessors.name}</td>
                    <td>{OrgAssessors.role}</td>
                    <td>{OrgAssessors.phoneNumber}</td>
                    <td>{OrgAssessors.email}</td>
                </tr>
            </tbody>
        </>
    )
}

export default Assessors;