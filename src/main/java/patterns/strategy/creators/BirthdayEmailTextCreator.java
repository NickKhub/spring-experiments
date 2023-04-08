package patterns.strategy.creators;

import org.springframework.stereotype.Component;
import patterns.strategy.dto.CreateEmailTextDTO;

@Component
public class BirthdayEmailTextCreator implements EmailTextCreator {
    @Override
    public String createEmailText(CreateEmailTextDTO createEmailTextDTO) {
        return "Happy Birthday, " + createEmailTextDTO.getUsername() + "! We are glad to help you any time!";
    }

    @Override
    public int getEmailType() {
        return 3;
    }
}
