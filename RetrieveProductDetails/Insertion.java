

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Insertion
 */
public class Insertion extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Insertion() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductDetails p=new ProductDetails();
		PrintWriter pw=response.getWriter();
		
		p.setPid(Integer.parseInt(request.getParameter("pid")));
		p.setPname(request.getParameter("pname"));
		p.setPcost(Integer.parseInt(request.getParameter("pcost")));
		
		ProductDAO dao=new ProductDAO();
		try {
			int i=dao.insert(p);
			if(i>0) {
				response.sendRedirect("Retrieve.html");
			}
			else {
				pw.print("Insertion failed");
			}
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		catch(SQLException e) {
		e.printStackTrace();
		}
	}

}
