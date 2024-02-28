import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ComplexNumberExtractorTest {


    @Test
    public void validateNull(){
        List<Integer> number = ComplexNumberExtractor.extractNumbers("");
        assertTrue(number.isEmpty());
    }

    @Test
    public void validateGroups(){
        int result = 0;
        List<Integer> number = ComplexNumberExtractor.extractNumbers("123-3456 23-789-5673");
        for (int i = 0; i < number.size(); i++) {
            result = number.get(i);
        }
        assertEquals(6462, result);
    }

    @Test
    public void validateInstanceVariable(){
        ComplexNumberExtractor complexNumberExtractor = new ComplexNumberExtractor();
        assertEquals(complexNumberExtractor.getClass(), ComplexNumberExtractor.class);
    }

    @Test
    public void validateDef(){
        int result = 0;
        List<Integer> number = ComplexNumberExtractor.extractNumbers("defend");
        for (int i = 0; i < number.size(); i++) {
            result = number.get(i);
        }
        assertEquals(456, result);
    }

    @Test
    public void validateAbc(){
        int result = 0;
        List<Integer> number = ComplexNumberExtractor.extractNumbers("abc");
        for (int i = 0; i < number.size(); i++) {
            result = number.get(i);
        }
        assertEquals(123, result);
    }

    @Test
    public void validateSpecial(){
        int result = 0;
        List<Integer> number = ComplexNumberExtractor.extractNumbers("special");
        for (int i = 0; i < number.size(); i++) {
            result = number.get(i);
        }
        assertEquals(999, result);
    }

    @Test
    public void validateAll(){
        int result = 0;
        List<Integer> number = ComplexNumberExtractor.extractNumbers("allletter");
        for (int i = 0; i < number.size(); i++) {
            result = number.get(i);
        }
        assertEquals(789, result);
    }

    @Test
    public void validateUpperCase(){
        int result = 0;
        List<Integer> number = ComplexNumberExtractor.extractNumbers("ALLPEOPLE");
        for (int i = 0; i < number.size(); i++) {
            result = number.get(i);
        }
        assertEquals(555, result);
    }

    @Test
    public void validateParsing(){
        int result = ComplexNumberExtractor.parseStringToInt("abc567");
        assertEquals(567, result);
    }

    @Test
    public void validateParsingNull(){
        int result = ComplexNumberExtractor.parseStringToInt("abc");
        assertEquals(0, result);
    }
}