const output = document.getElementById("output");
const URL = "http://localhost:9002/REST/ortaggi";
var puntielenco = "";
fetch(URL).then(function (risposta) {
    return risposta.json();
}).then(function (data) {
    
    for (let o of data){
        puntielenco += "<li>"+o.prodotto+"</li>";
        console.log(o.prodotto);
    }
    output.innerHTML = puntielenco;
})
