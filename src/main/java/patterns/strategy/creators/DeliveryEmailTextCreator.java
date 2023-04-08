package patterns.strategy.creators;

import org.springframework.stereotype.Component;
import patterns.strategy.dto.CreateEmailTextDTO;

@Component
public class DeliveryEmailTextCreator implements EmailTextCreator {
    @Override
    public String createEmailText(CreateEmailTextDTO createEmailTextDTO) {
        return "Dear " + createEmailTextDTO.getUsername() + ", your delivery is waiting for you at the our office.";
    }
    @Override
    public int getEmailType() {
        return 2;
    }
}
