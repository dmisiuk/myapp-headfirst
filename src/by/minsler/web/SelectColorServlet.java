package by.minsler;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import java.util.Iterator;
import java.util.ArrayList;
import by.minsler.model.BeerExpert;

public class SelectColorServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html> <head><title>Select Beer page </title>");
        out.println("<link rel='stylesheet' href='style/default.css' type='text/css'/></head><body>");
        String color = request.getParameter("color");
        out.println("Your are selected " + color + " color");
        out.println("<br> And We recommened you:");
        ArrayList<String> brands = new BeerExpert().getBrands(color);
        Iterator it = brands.iterator();
        while(it.hasNext()){
        	out.print("<br><span class=\"brand\"> try " + it.next() + " </span>");
        }
        out.println("</body></html>");
    }
}