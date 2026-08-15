public class User{
    private String name;
    private Role role;

    public User(String name,Role role){
        this.name = name;
        this.role = role;
    }

    public String getName(){
        return this.name;

    }

    public Role getRole(){
        return this.role;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setRole(Role role){
        this.role = role;
    }
}