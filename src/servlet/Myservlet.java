package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Myservlet
 */
public class Myservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Myservlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("gbk");
		response.getWriter().write("我是servlet，我已经开始执行");
		System.out.println("\t\t我是servlet我正在执行。。。。。。。。。。。。。");
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
