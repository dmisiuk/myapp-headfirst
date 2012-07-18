package by.minsler;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import java.util.Iterator;
import java.util.List;
import by.minsler.model.BeerExpert;

public class SelectColorServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        String color = request.getParameter("color");
        List<String> brands = new BeerExpert().getBrands(color);
        request.setAttribute("brands", brands);
        RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
        dispatcher.forward(request,response);
	}
}