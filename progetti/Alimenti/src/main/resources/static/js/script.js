var xhr = new XMLHttpRequest();
const URL = "/alimenti";
const OUT = document.getElementById('output');
const DETAIL = document.getElementById('dettaglio');
var listItem = "";

xhr.onreadystatechange = function() {
    console.log(xhr.readyState);
    console.log(xhr.status);

    if (xhr.readyState == 4 && xhr.status == 200) {
        
        let Obj = JSON.parse(xhr.responseText);

        for (const alim of Obj) {
            console.log(alim);

            listItem += "<li><a href='#' onclick='getOne(" + alim.id + ")'>" + alim.prodotto + "</a></li>";

        }
        OUT.innerHTML = listItem;
    }
}

xhr.open("GET", URL);
xhr.send();

function getOne(id) {
    xhr.onreadystatechange = function() {
        console.log(xhr.readyState);
        console.log(xhr.status);
    
        if (xhr.readyState == 4 && xhr.status == 200) {
            DETAIL.innerHTML = "";
            let scheda = "";
            let Obj = JSON.parse(xhr.responseText);
    
            for (const alim in Obj) {
                console.log(alim);
    
                scheda += Obj[alim] + "<br>";
    
            }
            DETAIL.innerHTML = scheda;
        }
    }
    
    xhr.open("GET", URL + "/" + id);
    xhr.send();
}