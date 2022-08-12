

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetDetails
 */
public class GetDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetDetails() {
        super();
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
		ProductDAO dao=new ProductDAO();
		PrintWriter pw=response.getWriter();
		try {
			ResultSet  rs=dao.retrieve(Integer.parseInt(request.getParameter("pid")));
			while(rs.next()) {
				pw.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		catch(SQLException e) {
		e.printStackTrace();
		}
	}

}
