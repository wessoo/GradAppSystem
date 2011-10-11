import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyMultiplier extends HttpServlet {
	/* Overrides doGet coming with HttpServlet */
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><head><title>Multiply by " + 3
				+ "</title></head></html><body>");
		String parameter = req.getParameter("num");
		/* Ignoring the possibility that parameter is not integer */
		/* Look example 4.2 in book for similar where exception is caught */
		out.println(parameter + " * " + 3 + " = " + 3
				* (Integer.parseInt(parameter)));
		out.println("</body></html>");
	}
}
