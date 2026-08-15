

public class Gpay implements PaymentStrategy{
    private int pin;

    public Gpay(int pin){
        this.pin = pin;
    }

    @Override
    public void pay(int amount){
        System.out.println("payment done by gpay of amount: " + amount);
    }
}