
public class Main{

    public static void main(String[] args){

        NotificationFactory factory = new  NotificationFactory();

        Notification notification =
            factory.createNotification(Type.EMAIL);
        notification.send("hii there!");

        Notification notification2 =
            factory.createNotification(Type.SMS);
        notification2.send("hii there!");

    }
}