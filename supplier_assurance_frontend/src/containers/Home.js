import "./Dashboard.css";

const Home = ({data})=>{
    return(
        <>
            <h2>Dashboard</h2>
            <div className="tile">
                <h3>Suppliers</h3>
                <h4>Number of Suppliers: {data[0].suppliers.length}</h4>
            </div>
            <div className="tile">
                <h3>Reviews</h3>
            </div>
            <div className="tile">
                <h3>Issues</h3>
            </div>
            <div className="tile">
                <h3>Assessors</h3>
                <h4>Number of Assessors: {data[0].assessors.length}</h4>
            </div>
        </>
    )
}

export default Home;