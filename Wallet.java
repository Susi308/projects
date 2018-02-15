package clearent;


public class Wallet {
	
	private CreditCards[] creditCards;
	private double creditCardsInterest = 0;
	
	/* all credit cards are passed to the constructor
     *setting the number of credit cards
     *getting the interest of the credit cards 
     * */

	public Wallet(CreditCards[] creditCards) {
		setCreditCards(creditCards);
        calculateInterest();
	}
	
	public void calculateInterest() {
		for(int i = 0; i < creditCards.length; i++)
			this.creditCardsInterest += creditCards[i].getCreditCardsInterest();
	}

    public double getCreditCardsInterest() {
		return creditCardsInterest;
	}

    public void setCreditCards(CreditCards[] creditCards) {
		this.creditCards = creditCards;
	}
}
