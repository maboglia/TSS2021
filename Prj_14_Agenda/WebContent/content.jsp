<%@ page import="model.*, controller.*"%>
	<h1><%= TITOLO %></h1>
	
<!-- comment html -->
		<%
			Settimana test = null;
			if (session.getAttribute("calendario") == null){
				 test = new Settimana("prova test");
				//sessione: area di memorizzazione sul server, posso salvare gli oggetti che voglio
				//dureranno finché non si chiude la sessione sul server
				session.setAttribute("calendario", test);
			} else {
				 test = (Settimana) session.getAttribute("calendario");
			}
			AgendaSettimanale as1 = new AgendaSettimanale(test);
			
			//commento java
			Settimana s = as1.getSettimana();
		
			Giornata g = s.getGiornate()[0];
			Giornata g2 = as1.getGiornata(0);
		
			Giornata mar = as1.getGiornata(1);
			//mar.getImpegni()[0].setImpegno("Esame Java e specializzazione in informatica distribuita");
			
			//genero 7 colonne, 1 per giorno della settimana			
			for(int i = 0; i<7; i++){
				out.print("<div class='colonna'>");
				//per ciascuna giornata, accedo agli impegni e li inserisco in una tab
					out.print("<table>");
					//ciclo per stampare gli impegni della giornata i
					for(Impegno imp : as1.getGiornata(i).getImpegni()){
						//per ciascun impegno creo una riga di tab
						out.print("<tr>");
							out.print("<td class='impegno'>");
								out.print(imp.getImpegno());
							out.print("</td>");
						out.print("</tr>");
			
					}
					out.print("</table>");
					
				out.print("</div>");
			}
			
			
			
			
		%>