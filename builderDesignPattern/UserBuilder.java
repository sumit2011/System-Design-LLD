public class UserBuilder{

    private String name;
    private double phoneNo;
    private String email;
    private String address;
    private String gender;

    // builder
    public UserBuilder name(String name){
        this.name = name;
        return this;
    }
    public UserBuilder phoneNo(double phoneNo){
        this.phoneNo = phoneNo;
        return this;
    }
    public UserBuilder email(String email){
        this.email = email;
        return this;
    }
    public UserBuilder address(String address){
        this.address = address;
        return this;
    }
    public UserBuilder gender(String gender){
        this.gender = gender;
        return this;
    }

    public User build(){
        return new User(this);
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