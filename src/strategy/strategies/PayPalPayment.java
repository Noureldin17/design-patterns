package strategy.strategies;

import strategy.behaviors.IPaymentStrategy;

public class PayPalPayment implements IPaymentStrategy {
    private String email;
    private String password;

    public PayPalPayment(String email, String password){
        this.email = email;
        this.password = password;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Paid " +amount+ " using PayPal!");
    }
}
