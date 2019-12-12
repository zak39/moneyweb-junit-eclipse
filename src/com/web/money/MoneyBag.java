package com.web.money;

import java.util.ArrayList;

public class MoneyBag {

	private ArrayList<Money> portefeuil = new ArrayList<Money>();
	private Money fArgent;
	// private Money[] portefeuil = new Money[] {};
	// Constructor
	public MoneyBag()
	{
		
	}
	
	public MoneyBag(Money argent)
	{
		this.fArgent = argent;
	}
	
	
	// Getters
	public ArrayList<Money> getPortefeuil()
	{
		return this.portefeuil;
	}
	
	
	// Setters
	public void setPortefeuil(Money piecette)
	{
		this.portefeuil.add(piecette);
	}
	
	// Methods
	public void add(Money gribis)
	{
		this.portefeuil.add(gribis);
	}
	
	public void subb(Money gribis)
	{
		this.portefeuil.remove(gribis);
	}
	
}
