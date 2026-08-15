
public class Main{

    public static void main(String[] args){

        User admin = new User("sumit",Role.ADMIN);
        User user = new User("amit" , Role.USER);
        User targetUser = new User("chhotu" , Role.USER);

        UserService realService = new UserServiceImpl();

        UserService proxy = new UserServiceProxy(realService);

        proxy.getUser(admin,targetUser);
        proxy.deleteUser(admin,targetUser);


        proxy.getUser(user,targetUser);
        proxy.deleteUser(user,targetUser);
    }
}