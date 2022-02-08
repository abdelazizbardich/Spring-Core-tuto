package ma.youcode;

public class MessageController {

    ChatService service;

    public MessageController(ChatService service) {
        this.service = service;
    }

    public void send(String message, String receiver){
        this.service.send(message,receiver);
    }
}
