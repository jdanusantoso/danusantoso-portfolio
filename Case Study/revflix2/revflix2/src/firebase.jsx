
import firebase from 'firebase/compat/app';
import 'firebase/compat/auth';
import 'firebase/compat/firestore';


const firebaseConfig = {
  apiKey: "AIzaSyDnW8n5rMtyaqGEeRYgDP7ypxLPC-2l_mw",
  authDomain: "revflix2.firebaseapp.com",
  projectId: "revflix2",
  storageBucket: "revflix2.appspot.com",
  messagingSenderId: "803348210934",
  appId: "1:803348210934:web:3f308d0fe311c6db17f8d7",
  measurementId: "G-JEQQZ742JC"
};

// Initialize Firebase
const firebaseApp = firebase.initializeApp(firebaseConfig);

const db = firebaseApp.firestore();
const auth = firebase.auth();

export { db, auth };