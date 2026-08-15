public class OrderFacade{
    private InventoryService inventoryService;
    private PaymentService paymentService;
    private ShippingService shippingService;
    private NotificationService notificationService;


    public OrderFacade(){
        this.inventoryService = new InventoryService();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
        this.notificationService = new NotificationService();
    }

    public void placeOrder(String item , int amount, String email){
        if (!inventoryService.checkAvailability(item)) {
            System.out.println("Product out of stock");
            return;
        }

        if (!paymentService.makePayment(amount)) {
            System.out.println("Payment failed");
            return;
        }

        shippingService.shipItem(item);

        notificationService.sendNotification(email);

        System.out.println("Order placed successfully");
    }
}