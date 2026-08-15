public class Main{
    public static void main(String[] args){

        LeaveReq req = new LeaveReq("sumit" , 30);

        LeaveHandler manager  = new Manager();
        LeaveHandler seniorManager = new SeniorManager();
        LeaveHandler director = new Director();

        // create the chain
        manager.setNextHandler(seniorManager);
        seniorManager.setNextHandler(director);
        director.setNextHandler(null);


        manager.handle(req);
        req.setDays(8);
        manager.handle(req);
        req.setDays(3);
        manager.handle(req);

    }
}