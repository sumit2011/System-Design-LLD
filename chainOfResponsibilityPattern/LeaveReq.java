public class LeaveReq{
    private String name;
    private int days;

    // constructor
    public LeaveReq(String name, int days){
        this.name = name;
        this.days = days;
    }

    // getter and setter
    public String getName(){
        return this.name;
    }

    public int getDays(){
        return this.days;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDays(int days){
        this.days = days;
    }


}