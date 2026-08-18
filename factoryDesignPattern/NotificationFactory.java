
public class NotificationFactory{

    public static  Notification createNotification(Type type){
        if(type==Type.EMAIL){
            return new Email();
        }
        else if(type==Type.WHATSAPP){
            return new Whatsapp();
        }else if(type == Type.SMS){
            return new Sms();
        }
        throw new IllegalArgumentException("Invalid notification type");
    }

}