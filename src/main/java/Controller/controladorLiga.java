package Controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import model.Jornada;


/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class controladorLiga extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controladorLiga() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        HttpSession session=request.getSession();
        String op = request.getParameter("op");  //para la operacion
        List<Jornada> jornadas = null;
        switch (op) {
        case "inicio":
            try {
            	//aqui las cositas
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } 
            
            session.setAttribute("jornadas", jornadas);
            request.getRequestDispatcher("Equipo.jsp").forward(request, response);
            break;
            
      
    
        default:
            break;
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