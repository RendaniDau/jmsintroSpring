package za.co.entelect.jmsintrospring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageListener.class);

    @JmsListener(destination = "Q.za.co.entelect.dojo.jms")
    public void onMessage(String message) {

        LOGGER.info(message);
    }
}
