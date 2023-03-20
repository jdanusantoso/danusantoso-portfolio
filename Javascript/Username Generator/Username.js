//Fetch all the elements

const btnEl = document.querySelector(".btn")
const inputEl = document.getElementById("input")
const copyIconEl = document.querySelector(".fa-copy")
const alertContainerEl = document.querySelector(".alert-container")

//Event Listeners
btnEl.addEventListener("click", () => {
    createUsername()


copyIconEl.addEventListener("click", () => {
    copyUsername();

    if(inputEl.value){

    alertContainerEl.classList.remove("active")

    setTimeout(() => {
        alertContainerEl.classList.add("active")
    }, 2000)
        
    }
    
    
})

function createUsername(){
    const chars = "0123456789abcdefghijklmnopqrstuvwxtzABCDEFGHIJKLMNOPQRSTUVWXYZ"
    const usernameLength = 8;
    let username =""

    for (let index =0; index < usernameLength; index++){
        const randomNum = Math.floor(Math.random() * chars.length)
        username += chars.substring(randomNum, randomNum+1)
    }

    inputEl.value=username;
    alertContainerEl.innerText = username + " copied!";
}


function copyUsername() {
    //Selecting the password
    inputEl.select()
    //For mobile
    inputEl.setSelectionRange(0, 9999);
    //Copy the password
    navigator.clipboard.writeText(inputEl.value);
    
}
})
