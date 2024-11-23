import org.example.Main;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class calculatorTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        // Redirect standard output to capture the program's output
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testAddition() {
        String simulatedInput = "10\n20\n1\n"; // Mock inputs: num1 = 10, num2 = 20, choice = 1 (addition)
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Main.main(null); // Call the main method

        String output = outputStream.toString();
        Assert.assertTrue(output.contains("Result: 30.0"));
    }

    @Test
    public void testSubtraction() {
        String simulatedInput = "50\n20\n2\n"; // Mock inputs: num1 = 50, num2 = 20, choice = 2 (subtraction)
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Main.main(null); // Call the main method

        String output = outputStream.toString();
        Assert.assertTrue(output.contains("Result: 30.0"));
    }

    @Test
    public void testMultiplication() {
        String simulatedInput = "5\n4\n3\n"; // Mock inputs: num1 = 5, num2 = 4, choice = 3 (multiplication)
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Main.main(null); // Call the main method

        String output = outputStream.toString();
        Assert.assertTrue(output.contains("Result: 20.0"));
    }

    @Test
    public void testDivision() {
        String simulatedInput = "40\n8\n4\n"; // Mock inputs: num1 = 40, num2 = 8, choice = 4 (division)
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Main.main(null); // Call the main method

        String output = outputStream.toString();
        Assert.assertTrue(output.contains("Result: 5.0"));
    }

    @Test
    public void testDivisionByZero() {
        String simulatedInput = "40\n0\n4\n"; // Mock inputs: num1 = 40, num2 = 0, choice = 4 (division)
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Main.main(null); // Call the main method

        String output = outputStream.toString();
        Assert.assertTrue(output.contains("Error: Division by zero is not allowed."));
    }

    @Test
    public void testInvalidChoice() {
        String simulatedInput = "40\n20\n5\n"; // Mock inputs: num1 = 40, num2 = 20, choice = 5 (invalid)
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Main.main(null); // Call the main method

        String output = outputStream.toString();
        Assert.assertTrue(output.contains("Invalid choice. Please choose a valid operation."));
    }
}
