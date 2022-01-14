function store(){ //stores items in the localStorage
    var fname = document.getElementById('fname').value;
    var lname = document.getElementById('lname').value;
    var sub1 = document.getElementById('sub1').value;
    var sub2 = document.getElementById('sub2').value; //gets the key from the user

    person = {
        name: lname,
        lname: sub1,
        sub1:sub2,
    }

    window.localStorage.setItem(key,JSON.stringify(car));  
    //converting object to string
}