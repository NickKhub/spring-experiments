package patterns.strategy.creators;

import patterns.strategy.dto.CreateEmailTextDTO;

public interface EmailTextCreator {
    String createEmailText(CreateEmailTextDTO createEmailTextDTO);

    int getEmailType();
}
