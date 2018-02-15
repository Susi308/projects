package clearent;

public class DiscoverCard implements CreditCards {
	
	private double balance;
	private double interest;
    private int discoverCardInterestRate = 1;

 /*balance is passed to the constructor
  *setting the credit card balance 
  *getting the credit card interest
  */
	public DiscoverCard(double balance) {
		setCreditCardBalance(balance);
		calculateCreditCardsInterest();
	}

	@Override
	public double getCreditCardsInterest() {
		return interest;
	}
	@Override
	public void calculateCreditCardsInterest() {
        this.interest = (balance/100) * discoverCardInterestRate;
	}
	@Override
	public void setCreditCardBalance(double balance) {
		this.balance = balance;
	}

}
