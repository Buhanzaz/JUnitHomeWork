import java.util.ArrayDeque;
import java.util.Deque;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReversePolishNotationCalculatorTest {
    private ReversePolishNotationCalculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new ReversePolishNotationCalculator();
    }

    @Test
    public void shouldCalculateAddition() {
        int answer = 7;
        int testValue = calculator.calculatePolishNotation("4 3 +");

        assertEquals(answer, testValue, "Ответ при сложении не совпадает");
    }
    @Test
    public void shouldCalculateSubtraction() {
        int answer = 1;
        int testValue = calculator.calculatePolishNotation("4 3 -");

        assertEquals(answer, testValue, "Ответ при вычитании не совпадает");
    }
    @Test
    public void shouldCalculateMultiplication() {
        int answer = 12;
        int testValue = calculator.calculatePolishNotation("4 3 *");

        assertEquals(answer, testValue, "Ответ при умножении не совпадает");
    }

    @Test
    public void shouldCalculateAdditions() {
        int answer = 5;
        int testValue = calculator.calculatePolishNotation("4 3 2 +");

        assertEquals(answer, testValue, "Ответ при сложении не совпадает");
    }
    @Test
    public void shouldCalculateSubtractions() {
        int answer = 1;
        int testValue = calculator.calculatePolishNotation("4 3 2 -");

        assertEquals(answer, testValue, "Ответ при вычитании не совпадает");
    }
    @Test
    public void shouldCalculateMultiplications() {
        int answer = 6;
        int testValue = calculator.calculatePolishNotation("4 3 2 *");

        assertEquals(answer, testValue, "Ответ при умножении не совпадает");
    }
    @Test
    public void shouldCalculateSpace() {
        int answer = 12;
        int testValue = calculator.calculatePolishNotation("4               3 *");

        assertEquals(answer, testValue, "Ответ при умножении не совпадает");
    }


}

class ReversePolishNotationCalculator {

    public int calculatePolishNotation(String str) {
        String[] parts = str.split(" ");
        Deque<Integer> numbers = new ArrayDeque<>();
        int index = 0;

        while (index != parts.length) {

            if (parts[index].isBlank()) {
                index++;
                continue;
            }

            if (isOperation(parts[index])) {
                int operandOne = numbers.pop();
                int operandTwo = numbers.pop();

                if (parts[index].equals("+")) {
                    numbers.push(operandOne + operandTwo);
                } else if (parts[index].equals("-")) {
                    numbers.push(operandTwo - operandOne);
                } else if (parts[index].equals("*")) {
                    numbers.push(operandOne * operandTwo);
                }

            } else {
                numbers.push(Integer.parseInt(parts[index]));
            }

            index++;
        }

        return numbers.pop();
    }

    private boolean isOperation(String part) {
        if (part.equals("+")
                || part.equals("-")
                || part.equals("*")) {
            return true;
        }

        return false;
    }
}