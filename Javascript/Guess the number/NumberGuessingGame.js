var enterButton = document.getElementById('enterButton');
var againButton = document.getElementById('againButton');
var output = document.getElementById('outputText');



var randomNumber = Math.ceil(Math.random()*100)


function checkNumber(){
    var input = document.getElementById('userInput').value;
    if(input == randomNumber){
        output.innerHTML = "You guessed the correct number. It was "  + randomNumber;
        output.style.color="green"
    }else if(input > randomNumber && input<100){
        output.innerHTML = "You guessed too high";
    }else if(input < randomNumber && input>1){
        output.innerHTML = "You guessed too low";
    }else if(input < 1){
        output.innerHTML = "Higher, the number has to be between 1 and 100";
    }else if(isNaN(input)){
        output.innerHTML="That's not a number!";
    }else{
        output.innerHTML = "Lower, it has to be between 1 and 100"
    }


}

enterButton.addEventListener("click", checkNumber);
againButton.addEventListener('click', function(){
    //Reload the page
    location.reload();
})