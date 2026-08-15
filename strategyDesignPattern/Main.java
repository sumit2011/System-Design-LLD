import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        PaymentStrategy strategy = null;
        Scanner scanner = new Scanner(System.in);

        int amount = 100;

        System.out.println("Select payment method: ");
        System.out.println("1. Credit card ");
        System.out.println("2. Gpay ");
        System.out.println("3. Paypal ");

        int choice = scanner.nextInt();
        // scanner.nextline();

        switch(choice){
            case 1:
                strategy = new CreditCard(1234,"sumit",123);
                break;
            case 2:
                strategy = new Gpay(7870);
                break;
            case 3:
                strategy = new Paypal("sumit@gmail.com");
                break;
            default:
                break;
        }
        PaymentProcessor processor = new PaymentProcessor(strategy);
        processor.makePayment(amount);


    }
}