package rnd.mate00.springamq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.core.JmsTemplate;

import java.util.Arrays;

/**
 * Created by mate00 on 23.07.17.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

//        Arrays.asList(context.getBeanDefinitionNames()).forEach(beanName -> System.out.print(beanName + ", "));

        JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);

        jmsTemplate.convertAndSend("myQueue", "new message");
    }

}
