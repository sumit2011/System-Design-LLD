
public class Paypal implements PaymentStrategy{

    private String email;

    public Paypal(String email){
        this.email = email;
    }

    @Override
    public void pay(int amount){
        System.out.println("Payment done by paypal of amount: " + amount);
    }
}