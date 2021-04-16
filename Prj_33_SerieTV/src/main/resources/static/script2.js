var scheda = document.getElementById("scheda");
var nomeSerie = document.getElementsByName("name")[0];
var ratingSerie = document.getElementsByName("rating")[0];

var output = '';
const URL = "http://api.tvmaze.com/search/shows?q="+nomeSerie.value;

fetch(URL).then(r => r.json()).then(
	
	function(risposta){
		console.log(risposta[0].show);
		
		let serie = risposta[0].show;
		
		output += serie.image.medium;
		ratingSerie.value =  serie.rating.average;
		
		// for ( let item of risposta  ){
		// 	//console.log(item.name);
		// 	output += '<option value="'+ item.id +'">' + item.name + '</option>';
		// }
		scheda.innerHTML += output;
		
	}
	
	
)