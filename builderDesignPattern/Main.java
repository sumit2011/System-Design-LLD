public class Main{

    public static void main(String[] args){


        User user1 = new UserBuilder()
                        .name("sumit")
                        .address("bihar")
                        .email("test@gmail.com")
                        .build();

       System.out.println(user1.getName());




    }
}