package za.co.entelect.jmsintrospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class JmsintrospringApplication {

    public static void main(String[] args) {
        SpringApplication.run(JmsintrospringApplication.class, args);
    }

}
