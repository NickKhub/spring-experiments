package patterns.strategy.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;

@Data
public class CreateEmailTextDTO {
    private static final String ILLEGAL_EMAIL_TYPE_MESSAGE = "Email type should be 1, 2 or 3";
    @Max(value = 3, message = ILLEGAL_EMAIL_TYPE_MESSAGE)
    @Min(value = 1, message = ILLEGAL_EMAIL_TYPE_MESSAGE)
    private int emailType;
    private String username;
}
