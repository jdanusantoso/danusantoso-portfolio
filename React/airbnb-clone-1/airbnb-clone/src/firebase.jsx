// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import { getAnalytics } from "firebase/analytics";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
  apiKey: "AIzaSyC74pZw5LN0s25RYuOFrjSbewxgB1Rp7xk",
  authDomain: "airbnb-1cd96.firebaseapp.com",
  projectId: "airbnb-1cd96",
  storageBucket: "airbnb-1cd96.appspot.com",
  messagingSenderId: "473157668055",
  appId: "1:473157668055:web:d2eb77720c93e510eff492",
  measurementId: "G-P6R97TDRTV"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);
const analytics = getAnalytics(app);