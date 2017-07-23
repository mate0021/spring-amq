package rnd.mate00.springamq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by mate00 on 23.07.17.
 */
@Component
public class Receiver {

    @JmsListener(destination = "myQueue", containerFactory = "containerFactory")
    public void onMessage(String message) {
        System.out.println(message);
    }
}
