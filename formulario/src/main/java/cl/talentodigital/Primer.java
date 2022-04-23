package cl.talentodigital;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Primer
 */
@WebServlet("/respuesta")
public class Primer extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Primer() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String nombre = request.getParameter("nombre");
		//Map parameters = request.getParameterMap();
		String nombres[] = request.getParameterValues("nombre");
		
		//for (String nombreN : nombres) {
		//	out.print("Bienvenido :" + nombreN + "<br>");
		//}
		
		
		
		out.print("Hola Mundo");
		out.print("Bienvenido :" + nombre);
		System.out.println("Aqui Estamos Probando el metodo get");
		HttpSession session = request.getSession();	
		out.print("\n");

		out.print(session.getId());
	    out.print("\n");
		 
		out.print(session.getAttribute("session_password"));
		


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
