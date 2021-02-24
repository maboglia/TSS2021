var xhr = new XMLHttpRequest();
const URL = "/alimenti";
const URL_CATEGORIE = "/alimenti/find/categorie/all";
const URL_CATEGORIA = "/alimenti/find/categorie/";
const OUT = document.getElementById('output');
const DETAIL = document.getElementById('dettaglio');
var listItem = "";
// console.log('test git in eclipse');
(function getCategories() {
    xhr.onreadystatechange = function() {
        console.log(xhr.readyState);
        console.log(xhr.status);
    
        if (xhr.readyState == 4 && xhr.status == 200) {
            
            let Obj = JSON.parse(xhr.responseText);
    
            for (const alim of Obj) {
                console.log(alim);
    
                listItem += "<li><a href='#' onclick='getCategory(" + '"' + alim + '"' + ")'>" + alim + "</a></li>";
    
            }
            OUT.innerHTML = listItem;
        }
    }
    
    xhr.open("GET", URL_CATEGORIE);
    xhr.send();
     
})()


function getCategory(cat) {
    console.log(cat);
    xhr.onreadystatechange = function() {
        console.log(xhr.readyState);
        console.log(xhr.status);
    
        if (xhr.readyState == 4 && xhr.status == 200) {
            DETAIL.innerHTML = '';
            let scheda = "<h2>" + cat +"</h2>"+"<table class='table table-striped'>";
            let Obj = JSON.parse(xhr.responseText);
    
            for (const alim of Obj) {
                console.log(alim);
    
                scheda += '<tr>' + "<td onclick='getProduct(" + '"' + alim.id + '"' + ")'>" + alim.prodotto + '</td>'+ '<td>' + alim.energia + '</td>' + '</tr>';
    
            }

            scheda += '</table>';

            DETAIL.innerHTML = scheda;
        }
    }
    
    xhr.open("GET", URL_CATEGORIA + "" + cat);
    xhr.send();
}

function getProduct(id) {
    console.log(id);
    xhr.onreadystatechange = function() {
        console.log(xhr.readyState);
        console.log(xhr.status);
    
        if (xhr.readyState == 4 && xhr.status == 200) {
            DETAIL.innerHTML = "";
            let Obj = JSON.parse(xhr.responseText);
            let scheda = "<h2>" + Obj.prodotto +"</h2>"+"<table class='table table-striped'>";
    
            for (const chiave in Obj) {
                console.log(chiave);
    
                scheda += '<tr>' + '<td>' +chiave + ': ' + Obj[chiave] + '</td>' + '</tr>';
    
            }

            scheda += '</table>';

            DETAIL.innerHTML = scheda;
        }
    }
    
    xhr.open("GET", URL + "/" + id);
    xhr.send();
}