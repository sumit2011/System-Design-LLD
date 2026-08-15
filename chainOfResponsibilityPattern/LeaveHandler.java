public interface LeaveHandler{

    public void setNextHandler(LeaveHandler nextHandler);
    public void handle(LeaveReq leaveReq);

}