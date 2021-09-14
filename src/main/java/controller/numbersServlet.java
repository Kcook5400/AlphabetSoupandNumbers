package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.alphabetInfo;
import model.numbersInfo;

/**
 * Servlet implementation class numbersServlet
 */
@WebServlet("/numbersServlet")
public class numbersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public numbersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userNumber1 = request.getParameter("userNumber1");
		String userNumber2 = request.getParameter("userNumber2");
		
		
		numbersInfo number = new numbersInfo(Integer.parseInt(userNumber1), Integer.parseInt(userNumber2));
		
		
		request.setAttribute("NumberStats", number);
		
		getServletContext().getRequestDispatcher("/results2.jsp").forward(request, response);
		
		//PrintWriter writer = response.getWriter();
		//writer.println(number.toString()+"!");
		//writer.close();
		
	}

}
