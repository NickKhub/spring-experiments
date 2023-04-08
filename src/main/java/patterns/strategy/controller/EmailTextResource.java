package patterns.strategy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import patterns.strategy.dto.CreateEmailTextDTO;
import patterns.strategy.service.EmailTextService;

@RestController
@RequestMapping("/email")
@RequiredArgsConstructor
public class EmailTextResource {
    private final EmailTextService emailCreatorService;

    @PostMapping("/create-text")
    public String createEmailText(@RequestBody @Validated CreateEmailTextDTO createEmailTextDTO) {
        return emailCreatorService.createEmailText(createEmailTextDTO);
    }
}
