package payment;

public class CardPayment implements Payment{

    @Override
    public boolean pay(double amount){
        System.out.println("Payment of amount " + amount + " done using card");
        return true;
    }
    
}