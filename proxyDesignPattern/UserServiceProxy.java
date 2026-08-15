
public class UserServiceProxy implements UserService{

    private UserService userService;

    // constructor
    public UserServiceProxy(UserService userService){
        this.userService = userService;
    }

    // methods
    @Override
    public boolean getUser(User caller, User target){
        userService.getUser(caller , target);
        return true;
    }

    @Override
    public boolean deleteUser(User caller, User target){
        if(caller.getRole() == Role.ADMIN){
            userService.deleteUser(caller,target);
        }else{
            System.out.println(caller.getName() + " is not authorized.");
        }
        return true;
    }
}