

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class info
 */
@WebServlet("/info")
public class info extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public info() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		String id=request.getParameter("pid");
		String name=request.getParameter("pname");
		double price=Double.parseDouble(request.getParameter("pprice"));
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jclass", "root", "starg");
			PreparedStatement st=con.prepareStatement("insert into product values(?,?,?)");
			st.setString(1, id);
			st.setString(2, name);
			st.setDouble(3, price);
			st.executeUpdate();
			st.close();
			con.close();
				response.getWriter().print("inserted successfully");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
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
