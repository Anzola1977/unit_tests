import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorImprovedTest {
    @Test
    public void testMultiply() {
        //Arrange
        CalculatorImproved test = new CalculatorImproved();
        int[] testData = {1, 2, 3};
        //Act
        int result = test.multiply(testData);
        //Assert
        assertEquals(6, result);
    }

    @Test
    public void testMultiplyNull() {
        //Arrange
        CalculatorImproved test = new CalculatorImproved();
        int[] testData = {0, 0};
        //Act
        int result = test.multiply(testData);
        //Assert
        assertEquals(0, result);
    }

    @Test
    public void testMultiplyOne() {
        //Arrange
        CalculatorImproved test = new CalculatorImproved();
        int[] testData = {1, 1};
        //Act
        int result = test.multiply(testData);
        //Assert
        assertEquals(1, result);
    }
}