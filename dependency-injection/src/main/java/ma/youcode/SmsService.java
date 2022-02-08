package ma.youcode;

public class SmsService implements ChatService{
    @Override
    public void send(String receiver, String message) {
        System.out.println("========= SMS service ==========");
        System.out.println(message+" have ben sent using SMS service to "+receiver+" successfully");
    }
}
