package KEA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {
    Planet mars = new Planet("Mars", 3500000,2, 146, 700);
   SystemLogic systemLogic = new SystemLogic() ;
    Planet earth = new Planet("Earth", 5000000,1, 92, 365);
//    Planet earth ;
//    @BeforeEach
//    void startpoint (){
//        SystemLogic systemLogic = new SystemLogic() ;
//        earth.setNumberOfMoons(1);
//    }

    @Test
    void getNumberOfMoons() {
        //arrange
        int exp = 2;
        //act
        int result = mars.getNumberOfMoons() ;
        //assert
        assertEquals(exp, result);
    }

    @Test
    void getTimeToOrbitSun() {
        //arrange
        int exp = 365;
        //act
        int result = earth.getTimeToOrbitSun();
        //assert
        assertEquals(exp, result);
    }
}