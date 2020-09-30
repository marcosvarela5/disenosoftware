package datatime;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearUtilitiesTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isleap() {

        assertFalse(YearUtilities.isleap(2019)); // No es bisiesto porque no es divisible entre 4
        assertTrue(YearUtilities.isleap(2020)); // Es bisiesto, divisible entre 4 y no entre 100
        assertFalse(YearUtilities.isleap(1900)); // No es bisiesto, divisible entre 4 pero también entre 100
        assertTrue(YearUtilities.isleap(2000)); // Bisiesto, divisible entre 4, 100 y 400
    }

    @Test
    void isZeroLeap(){assertThrows(IllegalArgumentException.class, () -> YearUtilities.isleap(0)); }

}