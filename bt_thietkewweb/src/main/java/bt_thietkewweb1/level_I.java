package bt_thietkewweb1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class level_I
 */
@WebServlet("/level_I")
public class level_I extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public level_I() {
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
		String p[],a[],o[];
		p = request.getParameterValues("Processor");
		a = request.getParameterValues("Accessories");
		o = request.getParameterValues("Option");
		
		for(int i=0 ; i <p.length; i++)
		{
			System.out.println(p[i]+" " );
		}
		for(int i=0 ; i <a.length; i++)
		{
			System.out.println(a[i]+" " );
		}
		for(int i=0 ; i <o.length; i++)
		{
			System.out.println(o[i]+" " );
		}
		request.setAttribute("p",p );
		request.setAttribute("a",a );
		request.setAttribute("o",o );
		request.getRequestDispatcher("process_level1.jsp").forward(request, response);


	}

}
