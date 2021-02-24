var xhr = new XMLHttpRequest();
const URL = "/alimenti";
const URL_CATEGORIE = "/alimenti/find/categorie/all";
const URL_CATEGORIA = "/alimenti/find/categorie/";
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

            listItem += "<li><a href='#' onclick=getOne('" + alim + "')>" + alim + "</a></li>";

        }
        OUT.innerHTML = listItem;
    }
}

xhr.open("GET", URL_CATEGORIE);
xhr.send();

function getOne(id) {
    console.log(id);
    xhr.onreadystatechange = function() {
        console.log(xhr.readyState);
        console.log(xhr.status);
    
        if (xhr.readyState == 4 && xhr.status == 200) {
            DETAIL.innerHTML = "";
            let scheda = "";
            let Obj = JSON.parse(xhr.responseText);
    
            for (const alim of Obj) {
                console.log(alim);
    
                scheda += alim.prodotto + "<br>";
    
            }
            DETAIL.innerHTML = scheda;
        }
    }
    
    xhr.open("GET", URL_CATEGORIA + "" + id);
    xhr.send();
}