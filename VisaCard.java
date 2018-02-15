package clearent;

public class VisaCard implements CreditCards {

	private double balance;
	private double interest;
    private int visaCardInterestRate = 10;
    
    /*balance is passed to the constructor
     *setting the credit card balance 
     *getting the credit card interest
     * */

    public VisaCard(double balance) {
		setCreditCardBalance(balance);
		calculateCreditCardsInterest();
	}

	@Override
	public double getCreditCardsInterest() {
		return interest;
	}
	@Override
	public void calculateCreditCardsInterest() {
		this.interest = (balance/100) * visaCardInterestRate;
	}
	@Override
	public void setCreditCardBalance(double balance) {
		this.balance = balance;
	}

}
