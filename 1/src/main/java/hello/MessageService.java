package hello;

import org.springframework.stereotype.Component;

@Component
public class MessageService {

    public MessageService() {
        super();
        System.out.println("Message service..");
    }

    public String getMessage(){
        return "hello world!";
    }
}
