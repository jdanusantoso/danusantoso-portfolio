//variables

let calculate = document.querySelector('#calculate');

calculate.addEventListener('click', () => {
    let totalBill = document.querySelector('#totalBill').value
    let tipPercent =document.querySelector('#tipPercent').value
    let split =document.querySelector('#split').value

    //Validate
    if(totalBill === '' || tipPercent ==0 || split ==0){
        alert('Please enter an appropriate value.');
        return;
    }

    //calculate
    let total = (totalBill * tipPercent) / split;
    total = total.toFixed(2);
    console.log(total);

    //display tip amount
    document.getElementById('tip').innerHTML = total;


})