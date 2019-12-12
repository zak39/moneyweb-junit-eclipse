package com.web.money;

import javax.servlet.http.HttpServletRequest;

public class ConnectionForm {

	private String resultat;

	
	// Geters & Setter generate by Eclipse
	public String getResultat()
	{
		return resultat;
	}

	public void setResultat(String resultat)
	{
		this.resultat = resultat;
	}
	
	// Methods
	public void verifierIdentifiants( HttpServletRequest request )
	{
		String login = request.getParameter("login");
		String pass = request.getParameter("pass");
	
		if(pass.equals(login + "123"))
		{
			this.resultat = "Vous êtes bien connecté !"; 
		}
		else
		{
			resultat = "Identifiants incorrects !";
		}
	}
}
