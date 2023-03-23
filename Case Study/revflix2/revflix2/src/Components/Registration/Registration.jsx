import React, { useState } from 'react'
import './Registration.css'
import axios from 'axios';
import { Link, useHistory} from 'react-router-dom'


function Login() {

    //Navigate to the dashboard after registration
    const history = useHistory();
    
    const [first_name, setfirst_Name] = useState('');
    const [last_name, setlast_Name] = useState('');
    const [email, setEmail] = useState('');
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');
    const [error, setError] = useState("");
    

    const validateForm = () => {
        if (!username || !password || !first_name || !last_name || !email) {
          return false;
        }
        return true;
      };

      const register = async (event) => {
        event.preventDefault();
        if (!validateForm()) {
          setError("All fields are required");
          return;
        }


      try {
        const response = await axios.post(
          "http://localhost:5556/data/users/registerUser",
          { first_name, last_name, email, username, password }
        );
        if (response.status === 202) {
          console.log("Registration Complete");
          console.log(response);
  
          event.id = response.data.id;
          event.username = response.data.username;
          event.password = response.data.password;
          event.first_name = response.data.first_name;
          event.last_name = response.data.last_name;
          event.email = response.data.email;
          history.push('/')
        } else if (response.status === 400) {
          console.log("");
        }
      } catch (error) {
        if (error instanceof Error) {
          setError("Registration not complete please try again");
         alert(error.message);
        }
      }
    };   

    

  return (
    <div className='login'>
            <Link to='/'>
                <img
                    className="login__logo"
                    src='https://upload.wikimedia.org/wikipedia/commons/thumb/a/a9/Amazon_logo.svg/1024px-Amazon_logo.svg.png' 
                />
            </Link>

            <div className='login__container'>
                <h1>Sign-in</h1>

                <form>
                <h5>First Name</h5>
                
                <input type='text' value={first_name} 
                
                onChange={e => setfirst_Name(e.target.value)} />

                <h5>Last Name</h5>
                
                <input type='text' value={last_name} 
                
                onChange={e => setlast_Name(e.target.value)} />
                
                <h5>E-mail</h5>
                
                <input type='text' value={email} 
                
                onChange={e => setEmail(e.target.value)} />

                <h5>Username</h5>
                <input type='username' 
                value={username} 
                onChange={e => setUsername(e.target.value)} />

                <h5>Password</h5>
                <input type='password' 
                value={password} 
                onChange={e => setPassword(e.target.value)} />

                    
                </form>

                

                <button onClick={register}className='login__registerButton'>Create your RevFlix Account</button>
            </div>
         </div>
  )
}

export default Login