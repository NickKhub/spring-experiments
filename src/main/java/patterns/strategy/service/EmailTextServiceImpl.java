package patterns.strategy.service;

import org.springframework.stereotype.Service;
import patterns.strategy.creators.EmailTextCreator;
import patterns.strategy.dto.CreateEmailTextDTO;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class EmailTextServiceImpl implements EmailTextService {
    private final Map<Integer, EmailTextCreator> emailTextCreators;

    public EmailTextServiceImpl(List<EmailTextCreator> emailTextCreators) {
        this.emailTextCreators = emailTextCreators.stream()
                .collect(Collectors.toMap(EmailTextCreator::getEmailType, textCreator -> textCreator));
    }
    public String createEmailText(CreateEmailTextDTO createEmailTextDTO) {
        return emailTextCreators.get(createEmailTextDTO.getEmailType()).createEmailText(createEmailTextDTO);
    }
}
