

public class Main{


    public static void main(String[] args){

        // Without Facade Design

        // InventoryService inventory = new InventoryService();
        // PaymentService payment = new PaymentService();
        // ShippingService shipping = new ShippingService();
        // NotificationService notification = new NotificationService();

        // if (inventory.checkAvailability("P101")) {

        //     if (payment.makePayment(1000)) {

        //         shipping.shipItem("P101");

        //         notification.sendNotification("user@gmail.com");
        //     }
        // }



        // With Facade Design
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder("P101",1000,"user@gmail.com");
        
    }
}