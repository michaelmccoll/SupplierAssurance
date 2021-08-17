import "./Dashboard.css";

const Home = ({data,loaded,reviews,ReviewsLoaded,issues,IssuesLoaded})=>{

    if(!loaded) {
        return(
            <p>...Data loading</p>
        )
    }

    if(!ReviewsLoaded) {
        return(
            <p>...Reviews loading</p>
        )
    }

    if(!IssuesLoaded) {
        return(
            <p>...Issues loading</p>
        )
    }

    return(
        <>
            <h2>Dashboard for {data[0].name}</h2>
            <div className="tile">
                <h3>Suppliers</h3>
                <h4>Number of Suppliers: {data[0].suppliers.length}</h4>
            </div>
            <div className="tile">
                <h3>Reviews</h3>
                <h4>Number of Reviews: {reviews.length}</h4>
            </div>
            <div className="tile">
                <h3>Issues</h3>
                <h4>Number of Issues: {issues.length}</h4>
            </div>
            <div className="tile">
                <h3>Assessors</h3>
                <h4>Number of Assessors: {data[0].assessors.length}</h4>
            </div>
        </>
    )
}

export default Home;