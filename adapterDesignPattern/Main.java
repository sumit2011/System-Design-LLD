
// client

public class Main{

    public static void main(String[] args){

        Razorpay razorpay = new Razorpay();

        PaymentProcessor processor = new RazorpayAdapter(razorpay);
        processor.pay(800);

    }
}