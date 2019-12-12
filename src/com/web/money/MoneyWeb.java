package com.web.money;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.argentContent.Money;
import com.argentContent.MoneyBag;


@WebServlet("/MoneyWeb")
public class MoneyWeb extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public MoneyWeb() 
    {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		// charge la page
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		/*response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"utf-8\" />");
        out.println("<title>Test</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>Bonjour Money Money !</p>");
        out.println("</body>");
        out.println("</html>");*/
		
        //Money myMoney01 = new Money();
        //Money myMoney02 = new Money();

		//MoneyBag poche = new MoneyBag();
		
		//String pocheID = UUID.randomUUID().toString();	// piste pour transiter les variables : https://stackoverflow.com/questions/10681229/how-to-send-an-object-from-jsp-to-servlet - add : 			<input type="hidden" name="pocheID" value="${pocheID}"/>

		//request.getSession().setAttribute(pocheID, poche);
		//request.setAttribute("pocheID", pocheID);
        
        
        //request.setAttribute("poche", poche);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/argent.jsp").forward(request, response); // On ne met pas "WebContent" car c'est purement cosmétique pour Eclipse
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		// envoie des donneest
		//doGet(request, response);
		
        //Money myMoney01 = new Money();
        //Money myMoney02 = new Money();

        MoneyBag poche = new MoneyBag();
        //String pocheID = request.getParameter("pocheID");
		
        //MoneyBag poche = (com.web.money.MoneyBag) request.getSession().getAttribute(pocheID);
        
        //request.getSession().removeAttribute(pocheID);
        
		String strArgent01 = request.getParameter("amount01");
		String currency01 = request.getParameter("currency01");
		
		String strArgent02 = request.getParameter("amount02");
		String currency02 = request.getParameter("currency02");
		
		//MoneyBag currentPoche = (MoneyBag) request.getParameter("currentPoche");
		
		if( strArgent01 != "" && currency01 != "")
		{
			int argent01 = Integer.parseInt(strArgent01);
			poche.add(new Money(argent01, currency01));
		}
		
		if( strArgent02 != "" && currency02 != "")
		{
			int argent02 = Integer.parseInt(strArgent02);
			poche.add(new Money(argent02, currency02));
		}
		
        request.setAttribute("poche",poche);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/argent.jsp").forward(request, response); // On ne met pas "WebContent" car c'est purement cosmétique pour Eclipse

	}

}
