import {useState} from 'react';

const AddAssessor = ({data})=>{
    const [Name,setNewName] = useState(null)
    const [Role, setNewRole] = useState(null)
    const [Email, setNewEmail] = useState(null)
    const [PhoneNum, setNewPhoneNum] = useState(null)

    const setName = (event) => {setNewName(event.target.value)}
    const setRole = (event) => {setNewRole(event.target.value)}
    const setEmail = (event) => {setNewEmail(event.target.value)}
    const setPhoneNum = (event) => {setNewPhoneNum(event.target.value)}

    const postAssessor = (e) => {
        e.preventDefault()
        fetch('http://localhost:8080/assessors', {
            method: 'POST',
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify({
                organisation: data[0],
                name: Name,
                role: Role,
                email: Email,
                phoneNumber: PhoneNum
            })
          })
          .then(response=>response.json())
          .then(window.location.reload())
          .then(result=>{console.log('Success', result)})}

    return(
        <>
        <h3>Add New Assessor</h3>
            <form>
                <div>
                    <label htmlFor="Name">Name Name: </label>
                    <input onChange={setName} type="text" name="Name" id="Name"></input>
                </div>
                <div>
                    <label htmlFor="Role">Role Name: </label>
                    <input onChange={setRole} type="text" name="Role" id="Role"></input>
                </div>
                <div>
                    <label htmlFor="Email">Email Name: </label>
                    <input onChange={setEmail} type="email" name="Email" id="Email"></input>
                </div>
                <div>
                    <label htmlFor="PhoneNum">PhoneNum Name: </label>
                    <input onChange={setPhoneNum} type="integer" name="PhoneNum" id="PhoneNum"></input>
                </div>
                <input class="submit" onClick={postAssessor} type="submit" value="submit"></input>
            </form>
        </>
    )
}
export default AddAssessor;