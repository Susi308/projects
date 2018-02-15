package clearent;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Test_UT {

    private int creditCardBalance = 100;
    private VisaCard visaCard = new VisaCard(creditCardBalance);
    private MasterCard masterCard = new MasterCard(creditCardBalance);
    private DiscoverCard discoverCard = new DiscoverCard(creditCardBalance);

// Test Data for test case 1
    private CreditCards[] creditCards = { visaCard, masterCard, discoverCard };
    private Wallet[] wallet = { new Wallet(creditCards) };
    private Person person1 = new Person(wallet);


// Test Data for test case 2
    private CreditCards[] wallet1 = {visaCard, discoverCard};
    private CreditCards[] wallet2 = {masterCard};
    private Wallet[] wallets = {new Wallet(wallet1), new Wallet(wallet2)};
    private Person person2 = new Person(wallets);

// Test Data for test case 3
    private CreditCards[] creditCardsPerson1 = {masterCard, visaCard, discoverCard};
    private CreditCards[] creditCardsPerson2 = {visaCard, masterCard};
    private Wallet[] walletPerson1 = {new Wallet(creditCardsPerson1)};
    private Wallet[] walletPerson2 = {new Wallet(creditCardsPerson2)};
    private Person person3 = new Person(walletPerson1);
    private Person person4 = new Person(walletPerson2);
    
    
//------------------------------------------------------------------------------
// JUnit Testing 
    
	@Test
	public void testVisaCardInterest() {
		assertEquals(10.0, creditCards[0].getCreditCardsInterest(), 0);
	}
	
	@Test
	public void testMasterCreditCardInterest() {
		assertEquals(5.0, creditCards[1].getCreditCardsInterest(), 5.0);
	}
	
	@Test
	public void testDiscoverCreditCardInterest() {
		assertEquals(1.0, creditCards[2].getCreditCardsInterest(), 1);
	}
	
	 @Test
    public void testInterestForAllCards() {
        assertEquals(16.0, person1.getCreditCardInterest(), 16.0);
    }

    @Test
    public void testWallet1() {
        assertEquals(11.0, wallets[0].getCreditCardsInterest(), 11);
    }

    @Test
    public void testWallet2() {
        assertEquals(5.0, wallets[1].getCreditCardsInterest(), 5);
    }

    @Test
    public void testInterestForAllWallets() {
        assertEquals(16.0, person2.getCreditCardInterest(), 16);
    }


    @Test
    public void testInterestForPerson3() {
        assertEquals(16, person3.getCreditCardInterest(), 15);
    }

    @Test
    public void testInterestForPerson4() {
        assertEquals(15.0, person4.getCreditCardInterest(), 15);
    }

    @Test
    public void testInterestForWallet1() {
        assertEquals(16.0, walletPerson1[0].getCreditCardsInterest(), 15);
    }

    @Test
    public void testInterestForWallet2() {
        assertEquals(15.0, walletPerson2[0].getCreditCardsInterest(), 15);
    }

}
