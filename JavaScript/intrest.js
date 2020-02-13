function interest() {
    var amt = document.getElementById('amount').value;
    var rt = document.getElementById('rate').value;
    var t = document.getElementById('time').value;
    var si = amt*rt*t *0.01;
    alert("interest :"+si);

}