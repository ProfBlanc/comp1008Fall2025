package wk4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class GradeTest {

    @Test
    public void testingDefaultConstructor() {
        Grade grade = new Grade();
        double expectedPercentage = 0;
        String expectedLetter = "F";

        double actualPercentage = grade.getPercentage();
        String actualLetter = grade.getLetter();

        assertEquals(expectedLetter, actualLetter);
        assertTrue(expectedPercentage == actualPercentage);
        assertNotEquals(expectedPercentage, actualPercentage - 1);
        assertFalse(expectedPercentage != actualPercentage);
    }
    @Test
    public void testingOneArgumentConstructor() {
        Grade grade = new Grade("F");
        assertEquals(grade.getLetter(), "F");
        assertTrue(grade.getPercentage() < 50);
    }
    @ParameterizedTest
    @ValueSource(doubles = {1, 10, 20, 30, 40, 49})  //ValueSource = list of values passed to method
    public void testingGradePercentageConstructor(double percentage) {
        Grade grade = new Grade(percentage);

        assertEquals(grade.getLetter(), "F");
        assertEquals(grade.getPercentage(), percentage);
        assertTrue(grade.getPercentage() < 50);

    }
}