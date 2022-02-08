package ma.youcode;

public class EmailService implements ChatService{


    @Override
    public void send(String receiver, String message) {
        System.out.println("========= Email service ==========");
        System.out.println(message+" have ben sent using Email service to "+receiver+" successfully");
    }
}
