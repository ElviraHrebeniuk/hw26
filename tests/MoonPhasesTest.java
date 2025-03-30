import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MoonPhasesTest {
    @Test
    public void testMoonPhases(){

        //т.к. у меня возвращает список фаз, я должна проверять содержится ли та или иная фаза в листе.
        //
        List<MoonPhases> phasesList  = MoonPhases.valueOf(10);
        List<MoonPhases> expectedList = new ArrayList<>();
        expectedList.add(MoonPhases.NEW_MOON);
        Assertions.assertArrayEquals(expectedList.toArray(), phasesList.toArray());

        phasesList = MoonPhases.valueOf(90);
        expectedList.clear();
        expectedList.add(MoonPhases.FULL_MOON);
        Assertions.assertArrayEquals(expectedList.toArray(), phasesList.toArray());

        phasesList = MoonPhases.valueOf(31);
        expectedList.clear();
        expectedList.add(MoonPhases.WAXING_MOON);
        expectedList.add(MoonPhases.WANING_CRESCENT);
        Assertions.assertArrayEquals(expectedList.toArray(), phasesList.toArray());

        phasesList = MoonPhases.valueOf(68);
        expectedList.clear();
        expectedList.add(MoonPhases.WAXING_GIBBOUS);
        expectedList.add(MoonPhases.WANING_GIBBOUS);
        Assertions.assertArrayEquals(expectedList.toArray(), phasesList.toArray());

        phasesList = MoonPhases.valueOf(45);
        expectedList.clear();
        expectedList.add(MoonPhases.FIRST_QUARTER);
        expectedList.add(MoonPhases.LAST_QUARTER);
        Assertions.assertArrayEquals(expectedList.toArray(), phasesList.toArray());

        System.out.println("test finish");
    }
}
