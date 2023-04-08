package patterns.strategy.service;

import patterns.strategy.dto.CreateEmailTextDTO;

public interface EmailTextService {
    String createEmailText(CreateEmailTextDTO createEmailTextDTO);
}
