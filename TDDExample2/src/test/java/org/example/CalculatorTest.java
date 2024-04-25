/*
B211202068
Nurullah Kapancı
SWE202 Software Verification and Validation, 2023-2024 Spring Semester, Homework-1
https://github.com/NurullahKapanci/SVV-Homework.git
*/
package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;

class CalculatorTest {

    @ParameterizedTest
    @MethodSource("divisionProvider")
    void testDivision(float dividend, float divisor, float expected) {
        assertEquals(expected, Calculator.divide(dividend, divisor));
    }

    static Stream<Float[]> divisionProvider() {
        return Stream.of(
                new Float[]{10f, 2f, 5f},     // testDivision1
                new Float[]{10f, 4f, 2.5f},   // testDivision2
                new Float[]{12.5f, 2.5f, 5f}, // testDivision3
                new Float[]{10f, 2.5f, 4f},   // testDivision4
                new Float[]{12.5f, 5f, 2.5f}  // testDivision5
        );
    }
}
