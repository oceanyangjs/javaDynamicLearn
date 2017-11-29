import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) {
		try {
			response.getWriter().println("<h1>HHHHHHello SSSSSServlet!!!");
			response.getWriter().println(new Date().toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
