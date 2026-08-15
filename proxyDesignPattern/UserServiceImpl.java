public class UserServiceImpl implements UserService{
    
    @Override
    public boolean getUser(User caller, User target){
        System.out.println(caller.getName() + " getting user detail: "+ target.getName());
        return true;
    }

    @Override
    public boolean deleteUser(User caller, User target){
        System.out.println(caller.getName() + " deleting User: " + target.getName());
        return true;
    }
}