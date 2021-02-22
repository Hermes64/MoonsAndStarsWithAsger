package KEA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoonTest {
    Planet earth;
    Moon moon = new Moon("Moon", 60000, earth, 27);

    @Test
    void testMasse() {
        //arrange
        int exp = 60000;
        //act
        int result = moon.getMasse();
        //assert
        assertEquals(exp, result);
    }

    @Test
    void testTimeToOrbitPlanet() {
        //arrange
        double exp = 28;
        //act
        double result = moon.getTimeToOrbitePlanet();
        //assert
        assertEquals(exp, result, "TimeToOrbit failed!!");
    }
}