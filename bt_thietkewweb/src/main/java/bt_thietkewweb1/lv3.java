package bt_thietkewweb1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class lv3
 */
@WebServlet("/lv3")
public class lv3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public lv3() {
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
		String lap[], dt[],ip[];
		  lap = request.getParameterValues("lap");
		  dt = request.getParameterValues("dt");
		  ip = request.getParameterValues("ip");
		  
			for(int i=0 ; i <lap.length; i++)
			{
				System.out.println(lap[i]+" " );
			}
			for(int i=0 ; i <dt.length; i++)
			{
				System.out.println(dt[i]+" " );
			}
			for(int i=0 ; i <ip.length; i++)
			{
				System.out.println(ip[i]+" " );
			}
			
			request.setAttribute("lap", lap);
			request.setAttribute("dt", dt);
			request.setAttribute("ip", ip);
			request.getRequestDispatcher("process_lv3.jsp").forward(request, response);
	}

}
