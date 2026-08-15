
public class SeniorManager implements LeaveHandler{

    private LeaveReq leaveReq;

    private LeaveHandler next;


    public void setNextHandler(LeaveHandler next){
        this.next = next;
    }

    public void handle(LeaveReq leaveReq){
        if(leaveReq.getDays() < 10){
            System.out.println("Approve by senior manager no of days: " + leaveReq.getDays() );
        }else{
            next.handle(leaveReq);
        }
    }

    
}