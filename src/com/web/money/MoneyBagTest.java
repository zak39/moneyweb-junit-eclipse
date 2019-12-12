package com.web.money;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class MoneyBagTest 
{

	@Test
	public void test()
	{
		System.out.println("Coucou");
	}
	
	MoneyBag sacAMain = new MoneyBag();
	Money argent01 = new Money(10,"GBP");
	Money argent02 = new Money(200,"EUR");
	Money argent03 = new Money(1500,"USD");
	Money argent04 = new Money(100,"CHF");
	
	@Test
	public void testTrue()
	{
		sacAMain.add(argent01);
		sacAMain.add(argent02);
		sacAMain.add(argent03);
		sacAMain.add(argent04);
		
		
		// test si sacAMain est de type MoneyBag 
		assertTrue(sacAMain instanceof MoneyBag);
		// test si un des element de sacAMain est de type Money
		assertTrue(sacAMain.getPortefeuil().get(0) instanceof Money );
		// test si une devise d'un des elements est de type String 
		assertTrue(sacAMain.getPortefeuil().get(0).getfCurrency() instanceof String);
	}
	
	@Test
	public void testEquals()
	{
		// Test si argent01 de sacAMain est egal a 1500 et de type USD
		//assertEquals(sacAMain.getPortefeuil().get(2).getfAmount(), 1500);
		//assertEquals(sacAMain.getPortefeuil().get(2).getfCurrency(), "USD");
	}
	
	@Before
	public void testBefore()
	{
		assertTrue(sacAMain instanceof MoneyBag);
	}
	
}
