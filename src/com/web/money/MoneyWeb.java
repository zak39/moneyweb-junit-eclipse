package com.web.money;

import java.io.IOException;
import java.io.PrintWriter;

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
		
		String msg = "I am Macron !!";
		request.setAttribute("variable", msg);
		
		String currency = request.getParameter("currency");
		request.setAttribute("currency",currency);
		
		Money monGrisbis = new Money();
		monGrisbis.setfAmount(35);
		monGrisbis.setfCurrency("EUR");
		
		request.setAttribute("monGrisbis",monGrisbis);

		
        Money myMoney01 = new Money(15,"EUR");
        Money myMoney02 = new Money(210,"USD");
        Money myMoney03 = new Money(1500,"CHF");
        Money myMoney04 = new Money(150,"GBP");

        System.out.println(myMoney01.getfAmount() + myMoney01.getfCurrency());
        System.out.println(myMoney02.getfAmount() + myMoney02.getfCurrency());
        System.out.println(myMoney03.getfAmount() + myMoney03.getfCurrency());
        System.out.println(myMoney04.getfAmount() + myMoney04.getfCurrency());

        myMoney01 = myMoney01.add(30,"EUR");
        System.out.println(myMoney01.getfAmount() + myMoney01.getfCurrency());

        myMoney02 = myMoney02.add(50,"USD");
        System.out.println(myMoney02.getfAmount() + myMoney02.getfCurrency());

        MoneyBag poche = new MoneyBag();
        poche.add(myMoney01);
        poche.add(myMoney02);
        poche.add(myMoney03);
        
        request.setAttribute("poche", poche);
        
        String[] titres = { "Nouvelle incendie", "Une île a été découerte", "Chute du dollard" };
        
        request.setAttribute("titres", titres);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/argent.jsp").forward(request, response); // On ne met pas "WebContent" car c'est purement cosmétique pour Eclipse
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		// envoie des donneest
		//doGet(request, response);
		
		//##################################################################
		//
		// Je met ce code pour eviter des erreurs.
		// En effet, après avoir cliquer sur le bouton "Envoyer", 
		// j'aurais un problème car il manque des objets, etc.
		//
		//##################################################################
		
		String msg = "I am Macron !!";
		request.setAttribute("variable", msg);
		
		String currency = request.getParameter("currency");
		request.setAttribute("currency",currency);
		
		Money monGrisbis = new Money();
		monGrisbis.setfAmount(35);
		monGrisbis.setfCurrency("EUR");
		
		request.setAttribute("monGrisbis",monGrisbis);

		
        Money myMoney01 = new Money(15,"EUR");
        Money myMoney02 = new Money(210,"USD");
        Money myMoney03 = new Money(1500,"CHF");
        Money myMoney04 = new Money(150,"GBP");

        System.out.println(myMoney01.getfAmount() + myMoney01.getfCurrency());
        System.out.println(myMoney02.getfAmount() + myMoney02.getfCurrency());
        System.out.println(myMoney03.getfAmount() + myMoney03.getfCurrency());
        System.out.println(myMoney04.getfAmount() + myMoney04.getfCurrency());

        myMoney01 = myMoney01.add(30,"EUR");
        System.out.println(myMoney01.getfAmount() + myMoney01.getfCurrency());

        myMoney02 = myMoney02.add(50,"USD");
        System.out.println(myMoney02.getfAmount() + myMoney02.getfCurrency());

        MoneyBag poche = new MoneyBag();
        poche.add(myMoney01);
        poche.add(myMoney02);
        poche.add(myMoney03);
        
        request.setAttribute("poche", poche);
        
        String[] titres = { "Nouvelle incendie", "Une île a été découerte", "Chute du dollard" };
        
        request.setAttribute("titres", titres);
		
		//##################################################################
		
		
        ConnectionForm form = new ConnectionForm();
        
        form.verifierIdentifiants(request);
        
        request.setAttribute("form", form);
        
		String nom = request.getParameter("nom");
		
		request.setAttribute("nom", nom);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/argent.jsp").forward(request, response); // On ne met pas "WebContent" car c'est purement cosmétique pour Eclipse

	}

}
