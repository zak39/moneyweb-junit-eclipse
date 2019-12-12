package com.web.money;


import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class MoneyTest 
{

	@Test
	public void test()
	{
		System.out.println("Coucou");
	}
	
	Money myMoneyTest = new Money(5,"EUR");
	Money myMoneyTestBis = new Money(-15,"CHF");
	
	@Test
	public void testConstructor()
	{
		// Init
		Money myMoneyTest03 = new Money(500,"BGP");
		
		int amountTest = 500;
		String currencyTest = "BGP";
		
		assertEquals(myMoneyTest03.getfAmount(), amountTest);
		assertEquals(myMoneyTest03.getfCurrency(), currencyTest);
	}
	
	@Test
	public void testTrue()
	{
		
		// Test si amount est positif
		assertTrue( myMoneyTest.getfAmount() > 0 );
		// Test si amount est negatif
		 assertTrue( myMoneyTestBis.getfAmount() < 0 );
		
		// Test si amount est de type int
		assertTrue(myMoneyTest.getfCurrency() == "EUR");
		
		assertTrue(myMoneyTest.getfCurrency() != "CHF");
		
		myMoneyTest.setfAmount(30);
		
		assertTrue(myMoneyTest.getfAmount() == 30);
		
		assertTrue(myMoneyTest.getfAmount() != myMoneyTestBis.getfAmount());
		
		assertTrue(myMoneyTest.getfCurrency() != myMoneyTestBis.getfCurrency());

		
	}
	
	@Test
	public void testEquals()
	{
		// Test si amount est egal a 5
		assertEquals(myMoneyTest.getfAmount(), 5);
		
		// Test si currency est egal a "EUR"
		assertEquals(myMoneyTest.getfCurrency(),"EUR");
	}
	
	
	@Test
	public void testAssumptionTrue()
	{
		System.setProperty("Currency", myMoneyTest.getfCurrency());
		Assumptions.assumeTrue(myMoneyTest.getfCurrency().equals(System.getProperty("Currency")));
		//assumeTrue("EUR".equalsIgnoreCase(System.getenv(myMoneyTest.getfCurrency())));		
		System.out.println("Yes mon test assumption assumetrue fonctionne !");
		
		//assertEquals(myMoneyTest.getfCurrency(),"EUR");

	}
	
	@Test
	public void testAssumptionFalse()
	{
		System.setProperty("Currency", myMoneyTest.getfCurrency());
		assumeFalse("CHF".equals(System.getProperty("Currency")));
		System.out.println("Yes mon test assumption assumefalse fonctionne !");
	}
	
	@Test
	public void testNotEquals()
	{
		assertNotEquals(myMoneyTest.getfAmount(), 10, "Il n'est pas egale a 10");	
	}
	
	@Test
	public void testType()
	{
		
		// Test si myMoneyTest est de la classe Money
		assertTrue(myMoneyTest instanceof Money);
		
		// Test si currency est de type String
		assertTrue(myMoneyTest.getfCurrency() instanceof String);
		// Test si amount est de type int
		//assertTrue(myMoneyTest.getfAmount());
		
	
	}
	
	@BeforeEach
	public void MoneyTestBefore()
	{
		System.out.println("Message avant chaque test");
	}
	
	@AfterEach
	public void testAfterEach()
	{
		System.out.println("Message apres chaque test");
	}
	
}
