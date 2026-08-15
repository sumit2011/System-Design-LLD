
public class CreditCard implements PaymentStrategy{

    private int cardNo;
    private String name;
    private int cvv;

    public CreditCard(int cardNo, String name, int cvv){
        this.cardNo = cardNo;
        this.name = name;
        this.cvv = cvv;
    }

    @Override
    public void pay(int amount){
        System.out.println("Payment done via credit card of amount: " + amount);
    }
}