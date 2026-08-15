package payment;

public class UpiPayment implements Payment{

    @Override
    public boolean pay(double amount){
        System.out.println("Payment of amount " + amount + " done using upi");
        return true;
    }
    
}