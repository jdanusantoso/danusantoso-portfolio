import React from 'react'
import "./SidebarOption.css";

//Pulling in the props
function SideBarOption({ option = "test", Icon }) {
  return (
    <div className='sidebarOption'>
        {/* Getting title from being passed in */}
        {/* If there is an icon, pass it in with the sideBarOption class name */}
        {Icon && <Icon className="sidebarOption__icon" />}
        {/* If there is an icon, make it an h4. 
        or else put it in a p tag */}
        {Icon ? <h4>{option}</h4> : <p>{option}</p>}
        
        
    </div>
  )
}

export default SideBarOption