public class Sms implements  Notification{

    @Override
    public void send(String message){
        System.out.println("sending message on sms: " + message);
    }
}