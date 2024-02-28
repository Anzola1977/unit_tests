import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordValidatorTest {

    PasswordValidator passwordValidator;
    String ANSWER1 = "Password should meet following requirements: ";
    String ANSWER2 = " Please, try again.";

    @BeforeEach
    void setUp() {
        passwordValidator = new PasswordValidator();
    }

    @Test
    void validateAll() {
        String answer = passwordValidator.validatePassword("andREI1977");
        assertEquals("true", answer);
    }

    @Test
    void validateDigit() {
        String answer = passwordValidator.validatePassword("andREI");
                assertEquals(ANSWER1 + " have at least one digit;" + ANSWER2, answer);
    }

    @Test
    void validateLowerCase() {
        String answer = passwordValidator.validatePassword("ANDREI1977");
        assertEquals(ANSWER1 + " have at least one lowercase letter;" + ANSWER2, answer);
    }

    @Test
    void validateUpperCase() {
        String answer = passwordValidator.validatePassword("andrei1977");
        assertEquals(ANSWER1 + " have at least one uppercase letter;" + ANSWER2, answer);
    }

    @Test
    void validateLongOfSymbols() {
        String answer = passwordValidator.validatePassword("ANd77");
        assertEquals(ANSWER1 + " be longer than 6 and shorter than 20 symbols;" + ANSWER2, answer);
    }
}