public class Manager implements LeaveHandler{

    private LeaveHandler next;

    public void setNextHandler(LeaveHandler next){
        this.next = next;
    }

    public void handle(LeaveReq leaveReq){
        if(leaveReq.getDays() < 5){
            System.out.println("Approved by manager no of days: " + leaveReq.getDays());
        }else{
            next.handle(leaveReq);
        }
    }
}