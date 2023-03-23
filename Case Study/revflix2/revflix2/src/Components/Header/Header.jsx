import React from "react";
import "./Header.css";
import SearchIcon from "@mui/icons-material//Search";
import ShoppingCartIcon from "@mui/icons-material/ShoppingCart";
import { Link } from "react-router-dom";
import { useStateValue } from "../ContextAPI/StateProvider";
import { auth } from '../../firebase';

function Header() {
  const [{ cart, user }, dispatch] = useStateValue();

  const handleAuthentication = () =>{
    if(user) {
      auth.signOut();
    }
}

return (
  <div className="header" id="navBar">
    {/* Linking to homepage */}
    <Link to="/">
      <img
        className="header__logo"
        src="./reflix.jpg"
      />
    </Link>

    <div className="header__search" id="navBar">
      <input className="header__searchInput" type="text" />
      <SearchIcon className="header__searchIcon" />
    </div>


    <div className="header__nav" id="navBar">

    {/* <div className="header__flag__option"> */}
    <img  src="https://flagsapi.com/US/flat/64.png"/>

        <p className="language-option">EN</p>
      {/* </div> */}

      {/* Redirect to login if there is no user */}
      <Link to={!user && '/login'}>
      <div onClick={handleAuthentication} className="header__option">
            <span className="header__optionLineOne">Hello {!user ? 'Guest' : user.email}</span>
            <span className="header__optionLineTwo">{user ? 'Sign Out' : 'Sign In'}</span>
      </div>
      </Link>
      
      <Link to='/orders'>
            <div className="header__option">
              <span className="header__optionLineOne">Returns</span>
              <span className="header__optionLineTwo">& Orders</span>
            </div>
      </Link>

      <div className="header__option" id="navBar">
        <span className="header__optionLineOne">Your</span>
        <span className="header__optionLineTwo">Account</span>
      </div>

      <Link to="/checkout">
      <div className="header__optionCart" id="navBar">
        <ShoppingCartIcon />
        <span className="header__optionLineTwo header__cartCount">
          {cart?.length}
        </span>
      </div>
    </Link>
  </div>
</div>
);
}

export default Header;