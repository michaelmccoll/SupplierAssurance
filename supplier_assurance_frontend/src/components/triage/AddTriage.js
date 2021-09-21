import {useState} from 'react';

const AddTriage = ({data})=>{
    const [Review,setNewReview] = useState(null)
    const [TriageDomain, setNewTriageDomain] = useState(null)
    const [TriageQuestion, setNewTriageQuestion] = useState(null)
    const [TriageGuidance, setNewTriageGuidance] = useState(null)
    const [TriageAnswer, setNewTriageAnswer] = useState(null)

    const setReview = (event) => {setNewReview(event.target.value)}
    const setTriageDomain = (event) => {setNewTriageDomain(event.target.value)}
    const setTriageQuestion = (event) => {setNewTriageQuestion(event.target.value)}
    const setTriageGuidance = (event) => {setNewTriageGuidance(event.target.value)}
    const setTriageAnswer = (event) => {setNewTriageAnswer(event.target.value)}

    const postTriage = (e) => {
        e.preventDefault()
        fetch('http://localhost:8080/organsations', {
            method: 'POST',
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify({
                review: Review, //This auto-selects the first review of the data given, may need to change to the review ID
                triageDomain: TriageDomain,
                triageQuestion: TriageQuestion,
                triageGuidance: TriageGuidance,
                triageAnswer: TriageAnswer
            })
          })
          .then(response=>response.json())
          .then(window.location.reload())
          .then(result=>{console.log('Success', result)})}

    return(
        <>
        <h3>Add New Triage</h3>
            <form>
                <div>
                    {/* Select review from dropdown list */}
                    <label htmlFor="Review">Select Supplier Review: </label>
                    <input onChange={setReview} type="text" name="Review" id="Review"></input>
                </div>
                <div>
                    {/* Select from existing or new from dropdown list */}
                    <label htmlFor="TriageDomain">Triage Domain: </label>
                    <input onChange={setTriageDomain} type="text" name="TriageDomain" id="TriageDomain"></input>
                </div>
                <div>
                    <label htmlFor="TriageQuestion">Triage Question: </label>
                    <input onChange={setTriageQuestion} type="text" name="TriageQuestion" id="TriageQuestion"></input>
                </div>
                <div>
                    {/* Can be auto-filled, based on */}
                    <label htmlFor="TriageGuidance">Triage Guidance: </label>
                    <input onChange={setTriageGuidance} type="integer" name="TriageGuidance" id="TriageGuidance"></input>
                </div>
                <div>
                    <label htmlFor="TriageAnswer">Triage Answer: </label>
                    <select onChange={setTriageAnswer} name="TriageAnswer" id="TriageAnswer"> //Not sure if syntax correct for onChange, name and id
                        <option value="Yes">Yes</option>
                        <option value="No">No</option>
                    </select>
                    {/* <input onChange={setTriageAnswer} type="text" name="TriageAnswer" id="TriageAnswer"></input> */}
                </div>
                <input class="submit" onClick={postTriage} type="submit" value="submit"></input>
            </form>
        </>
    )
}
export default AddTriage;