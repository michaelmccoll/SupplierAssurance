import {useState} from 'react';
import React from 'react';
import IssuesList from "../components/issues/IssuesList";

const Issues = ({issues,IssuesLoaded})=>{

    const [OrgIssues]= useState(issues)

    if(!IssuesLoaded) {
        return(
            <p>...loading</p>
        )
    }

    return(
        <>
            <h2>Issues</h2>
                <IssuesList issues={OrgIssues}/>
        
        </>
    )
}

export default Issues;