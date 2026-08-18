public class User{

    private String name;
    private double phoneNo;
    private String email;
    private String address;
    private String gender;

    public User(UserBuilder builder){
        this.name = builder.getName();
        this.phoneNo = builder.getPhoneNo();
        this.email = builder.getEmail();
        this.address = builder.getAddress();
        this.gender = builder.getGender();
    }

    // getters 
    public String getName(){
        return this.name;
    }

    public double getPhoneNo(){
        return this.phoneNo;
    }
    public String getEmail(){
        return this.email;
    }
    public String getAddress(){
        return this.address;
    }
    public String getGender(){
        return this.gender;
    }
}