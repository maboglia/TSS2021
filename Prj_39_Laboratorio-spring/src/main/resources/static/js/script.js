$(".continente").click(
	function(){
		console.log($(this).text());
		$("#elenco").remove();
			$.getJSON( "https://restcountries.eu/rest/v2/region/"+$(this).text(), function( data ) {
			  var items = [];
			  $.each( data, function( key, val ) {
			    items.push( "<li class='list-group-item' id='" + key + "'><img src='" + val.flag + "'></li>" );
			  });
			 
			  $( "<ul/>", {
			    "class": "list-group",
			    "id": "elenco",
			    html: items.join( "" )
			  }).appendTo( $(".container") );
			});
	}
);





