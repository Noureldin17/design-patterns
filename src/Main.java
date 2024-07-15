import strategy.context.ShoppingCart;
import strategy.strategies.CreditCardPayment;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new CreditCardPayment("12345678","Noureldin Mohamed", "123", "22-1-2099"));
        cart.checkout(100);
    }
}