<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<button id="carica_libri">Carica</button>

<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>

<script>

$("#carica_libri").click(function(){
	$.getJSON( "rest/libri", function( data ) {
	  var libri = [];
	  $.each( data, function( key, val ) {
	    libri.push( "<li id='" + key + "'>" + val.titolo + "</li>" );
	  });
	 
	  $( "<ul/>", {
	    "class": "my-new-list",
	    html: libri.join( "" )
	  }).appendTo( "body" );
	});
});



</script>

</body>
</html>