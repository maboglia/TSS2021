const output = document.getElementById("output");
var xhr = new XMLHttpRequest();
const URL = "http://localhost:9002/REST/ortaggi";

var puntielenco = "";

xhr.onreadystatechange = function () {
    console.log(xhr.readyState);
    console.log(xhr.status);

    if (xhr.readyState==4 && xhr.status==200){
        console.log(xhr.responseText);
        let string = xhr.responseText;
        let objJSON = JSON.parse(string);
        
        for (let o of objJSON){
            puntielenco += "<li>"+o.prodotto+"</li>";
        	console.log(o.prodotto);
        }
        
        console.log(objJSON);
		output.innerHTML = puntielenco;

    }


}

xhr.open("GET", URL);
xhr.send();
console.log(puntielenco);