package task1;

public class Main {
    public static void main(final String[] args) {
       try {
           final Address address = new Address("", "Lviv", "", 12);
           final User user = new User("Vlad", "Pred", 14, "0934535704", address);
           System.out.println(user);
       }catch (UncheckedException e){
           System.out.println(e.toString());
       }
    }
}
