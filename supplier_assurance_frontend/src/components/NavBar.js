import {Link} from 'react-router-dom';
import './NavBar.css';
import home from '../images/Icon.png';
import suppliers from '../images/Suppliers.png';
import assessors from '../images/Assessors.png';
import reviews from '../images/Review.png';
import issues from '../images/Issues.png';
import './NavBar.css';

const NavBar = () => {
    return(
        <>
        <ul className="navbar">
        <hr/>
            <li>
                <Link className="nonHighlight" to="/"><img className="navIcon" src={home} alt="suppliers"></img><a className="text">DASHBOARD</a></Link>
            </li>

            <li>
                <Link className="nonHighlight" to="/suppliers"><img className="navIcon" src={suppliers} alt="suppliers"></img><a className="text">SUPPLIERS</a></Link>
            </li>
        
            <li>
                <Link className="nonHighlight" to="/reviews"><img className="navIcon" src={reviews} alt="reviews"></img><a className="text">REVIEWS</a></Link>
            </li>

            <li>
                <Link className="nonHighlight" to="/issues"><img className="navIcon" src={issues} alt="issues"></img><a className="text">ISSUES</a></Link>
            </li>

            <li>
                <Link className="nonHighlight" to="/assessors"><img className="navIcon" src={assessors} alt="assessors"></img><a className="text">ASSESSORS</a></Link>
            </li>

        </ul>
        </>
    )
}

export default NavBar;