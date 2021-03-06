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
 * Servlet implementation class IniciarSesion
 */
@WebServlet("/IniciarSesion")
public class IniciarSesion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IniciarSesion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("deprecation")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	     PrintWriter out = response.getWriter();

		 String name = request.getParameter("userName");
	     String password = request.getParameter("userPassword");
	     	     
	     out.print("Bienvenido " + name);
	     
	     HttpSession session = request.getSession();
	     session.setAttribute("session_name",name );
	     session.setAttribute("session_password", password);
	     // session.setMaxInactiveInterval(10);
	
	    out.print(session.getId());
	    out.print("\n");
	    out.print(session.getAttribute("session_password"));
	    
	    if (session.getAttribute("session_password").equals("supersecreto")) {
		    out.print("Entraste a la seccion secreta");
		    out.print("\n");
		    
		    response.sendRedirect("/formulario/micuenta.jsp");

	    } else {
		    out.print("No sabes entrar");
		    out.print("\n");

	    }
	    		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
