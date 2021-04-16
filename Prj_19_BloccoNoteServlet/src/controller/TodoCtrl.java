package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Todo;

/**
 * Servlet implementation class TodoCtrl
 */
@WebServlet("/todo")
public class TodoCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ArrayList<Todo> todoList = new ArrayList<>();
	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if (request.getParameter("completa")!=null) {
			int index = Integer.parseInt(request.getParameter("completa"));
			if (index <= todoList.size() && todoList.get(index) != null )
				todoList.get(index).setCompletato(true);
		}
		
		request.setAttribute("todo", todoList);
		request.getRequestDispatcher("todolist.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String descrizione = request.getParameter("descrizione");
		Todo nuovo = new Todo(descrizione);
		todoList.add(nuovo);
		System.out.println("aggiunto todo " + nuovo.getDescrizione());
		doGet(request, response);
	}

}
