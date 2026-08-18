

public class Email implements Notification{

    @Override
    public void send(String message){
        System.out.println("send on email: " + message);
    }
}