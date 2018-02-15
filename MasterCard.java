package clearent;

public class MasterCard implements CreditCards {

	private double balance;
	private double interest;
    private int masterCardInterestRate = 5;
    
    /*balance is passed to the constructor
     *setting the credit card balance 
     *getting the credit card interest
     */

    public MasterCard(double balance) {
		setCreditCardBalance(balance);
		calculateCreditCardsInterest();
	}

	@Override
	public double getCreditCardsInterest() {
		return interest;
	}
	@Override
	public void calculateCreditCardsInterest() {
		this.interest = (balance/100) * masterCardInterestRate;
	}
	@Override
	public void setCreditCardBalance(double balance) {
		this.balance = balance;
	}

}
