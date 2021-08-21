import {useState} from 'react';

const Settings = ({data})=>{
    const [Supplier,setNewSupplier] = useState(null)
    const [Type,setNewType] = useState(null)
    const [Tier,setNewTier] = useState(null)
    const [Address,setNewAddress] = useState(null)
    const [Website,setNewWebsite] = useState(null)
    const [LastReviewDate,setNewLastReviewDate] = useState(null)
    const [NextReviewDate,setNewNextReviewDate] = useState(null)

    const setSupplier = (event) => {setNewSupplier(event.target.value)}
    const setType = (event) => {setNewType(event.target.value)}
    const setTier = (event) => {setNewTier(event.target.value)}
    const setAddress = (event) => {setNewAddress(event.target.value)}
    const setWebsite = (event) => {setNewWebsite(event.target.value)}
    const setLastReviewDate = (event) => {setNewLastReviewDate(event.target.value)}
    const setNextReviewDate = (event) => {setNewNextReviewDate(event.target.value)}
    
    // Doesn't post, as would need to also create a new Org. Remove 'organisation' from supplier backend model. Or had-code the Org=1 and send it down to other pages.
    const addSupplier = (e) => {
        e.preventDefault()
        fetch('http://localhost:8080/suppliers', {
            method: 'POST',
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify({
                organisation: data[0],
                name: Supplier,
                type: Type,
                tier: Tier,
                address: Address,
                website: Website,
                lastReviewDate: LastReviewDate,
                nextReviewDate: NextReviewDate
            })
          })
          .then(response=>response.json())
          .then(result=>{console.log('Success', result)})}

    return(
        <>
        <h3>Add New Supplier</h3>
            <form>
                <div>
                    <label htmlFor="Supplier">Supplier Name: </label>
                    <input onChange={setSupplier} type="text" name="Supplier" id="Supplier"></input>
                </div>
                <div>
                    <label htmlFor="Type">Type: </label>
                    <input onChange={setType} type="text" name="Type" id="Type"></input>
                </div>
                <div>
                    <label htmlFor="Tier">Tier: </label>
                    <input onChange={setTier} type="text" name="Tier" id="Tier"></input>
                </div>
                <div>
                    <label htmlFor="Address">Address: </label>
                    <input onChange={setAddress} type="text" name="Address" id="Address"></input>
                </div>
                <div>
                    <label htmlFor="Website">Website: </label>
                    <input onChange={setWebsite} type="text" name="Website" id="Website"></input>
                </div>
                <div>
                    <label htmlFor="LastReviewDate">Last Review Date: </label>
                    <input onChange={setLastReviewDate} type="date" name="LastReviewDate" id="LastReviewDate"></input>
                </div>
                <div>
                    <label htmlFor="newNextReviewDate">Next Review Date: </label>
                    <input onChange={setNextReviewDate} type="date" name="newNextReviewDate" id="newNextReviewDate"></input>
                </div>
                <input class="submit" onClick={addSupplier} type="submit" value="submit"></input>
            </form>
        </>
    )
}
export default Settings;