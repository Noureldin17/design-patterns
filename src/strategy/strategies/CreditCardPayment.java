package strategy.strategies;

import strategy.behaviors.IPaymentStrategy;

public class CreditCardPayment implements IPaymentStrategy {

    private String cardNumber;
    private String cardHolderName;
    private String cvv;
    private String expiryDate;


    public CreditCardPayment(String cardNumber, String cardHolderName, String cvv, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card!");
    }
}
