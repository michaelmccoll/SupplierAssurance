import {useState} from 'react';
import React from 'react';
import AssessorList from "../components/assessors/AssessorList";

const Assessors = ({data})=>{

    const [OrgAssessors]= useState(data[0].assessors)

    return(
        <>
         <h2>Assessors</h2>
            <AssessorList assessors={OrgAssessors}/>
        </>
    )
}

export default Assessors;