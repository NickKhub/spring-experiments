package patterns.strategy.creators;

import org.springframework.stereotype.Component;
import patterns.strategy.dto.CreateEmailTextDTO;

@Component
public class GreetingEmailTextCreator implements EmailTextCreator {
    @Override
    public String createEmailText(CreateEmailTextDTO createEmailTextDTO) {
        return "Hello, " + createEmailTextDTO.getUsername() + "! Nice to meet you!";
    }

    @Override
    public int getEmailType() {
        return 1;
    }
}
