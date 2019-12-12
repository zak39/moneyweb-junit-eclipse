package com.web.money;


public class Money 
{

	private int fAmount;        // Montant
    private String fCurrency;   // Devise (EUR, USD, CHF, GBP)

    // Constructeur
    public Money()
    {
    	
    }
    
    public Money(int amount, String currency)
    {
        this.fAmount = amount;
        this.fCurrency = currency;
    }

    // Getters
    public int getfAmount()
    {
        return this.fAmount;
    }

    public String getfCurrency()
    {
        return this.fCurrency;
    }

    // Setter
    public void setfAmount(int newfAmount)
    {
        this.fAmount = newfAmount;
    }

    public void setfCurrency(String newCurrency)
    {
        this.fCurrency = newCurrency;
    }

    // Methods
    public Money add(Money m)
    /// Retourne une money
    {
      return  m;
    }

    public Money add(int namount, String ncurrency)
    {
        if (this.fCurrency == ncurrency)
        {
            int totalAmount = namount + this.fAmount;
            return add(new Money(totalAmount, ncurrency));
        }

        return null;


    }

	

}
