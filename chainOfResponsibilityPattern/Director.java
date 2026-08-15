public class Director implements LeaveHandler{
    private LeaveHandler next;

    public void setNextHandler(LeaveHandler next){
        this.next = next;
    }

    public void handle(LeaveReq leaveReq){
        System.out.println("Approved by Director no of days: " + leaveReq.getDays());
    }
}