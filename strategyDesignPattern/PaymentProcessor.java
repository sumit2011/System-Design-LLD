
// context

public class PaymentProcessor{

    private PaymentStrategy strategy;

    public PaymentProcessor(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public void makePayment(int amount){
        strategy.pay(amount);
    }
}