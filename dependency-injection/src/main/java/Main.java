import ma.youcode.EmailService;
import ma.youcode.SmsService;
import ma.youcode.PhoneService;
import ma.youcode.MessageController;

public class Main {
    public static void main(String[] args) {

        // Send by SMS
            MessageController controller1 = new MessageController(new SmsService());
            controller1.send("Hello from chat","Username");
        // Send by Email
            MessageController controller2 = new MessageController(new EmailService());
            controller2.send("Hello from chat","Username");
        // Send by Phone
            MessageController controller3 = new MessageController(new PhoneService());
            controller3.send("Hello from chat","Username");

    }
}
