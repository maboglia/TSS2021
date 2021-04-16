var genere = document.getElementById("idGenere");
var output = '';
const URL = "/api/generi";

fetch(URL).then(r => r.json()).then(
	
	function(risposta){
		console.log(risposta);
		for ( let item of risposta  ){
			//console.log(item.name);
			output += '<option value="'+ item.id +'">' + item.name + '</option>';
		}
		genere.innerHTML += output;
		
	}
	
	
)