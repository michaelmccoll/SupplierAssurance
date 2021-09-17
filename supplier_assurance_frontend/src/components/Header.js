import {Link} from 'react-router-dom';
import icon from '../images/Icon.png';
import settings from '../images/Settings.png';
import './Header.css';

const Header = () => {
    return(
        <>
            <Link className="nonHighlight" to="/"><img className="icon" src={icon} alt="Supplier Assurance icon"></img></Link>
            <Link className="nonHighlight" to="/settings"><img className="settings" src={settings} alt="Settings"></img><a className="title">SUPPLIER ASSURANCE</a></Link>
            <hr />
        </>
    )
}

export default Header;