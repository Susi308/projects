package clearent;


public class Person {
	
	private Wallet[] wallet;
	private double creditCardsInterest = 0;

/* A wallet array is passed in the method 
 * setting the total amount of credit cards in a wallet 
 * calculating the total interest of the wallet	
 */	
	public Person(Wallet[] wallet) {
		setWallet(wallet);
        calculateInterest();
	}

// A method that calculates the interest
    public void calculateInterest() {
		for(int i = 0; i < wallet.length; i++)
			this.creditCardsInterest += wallet[i].getCreditCardsInterest();
	}

// set the wallet to the number of wallets occurred
    public void setWallet(Wallet[] wallet) {
		this.wallet = wallet;
	}
    
// calculating the total credit card interest 
    public double getCreditCardInterest() {
		return creditCardsInterest;
	}
}
