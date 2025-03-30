import java.util.ArrayList;
import java.util.List;

public enum MoonPhases {
    NEW_MOON(0),
    WAXING_MOON(25),
    FIRST_QUARTER(50),
    WAXING_GIBBOUS(75),
    FULL_MOON(100),
    WANING_GIBBOUS(75),
    LAST_QUARTER(50),
    WANING_CRESCENT(25);

    private final int percent;

    MoonPhases(int percent){
        this.percent = percent;
    }

    public int getPercent(){
        return percent;
    }

    @Override
    public String toString() {
        return this.name() +"  "+  percent+ "%";
    }

    public static List<MoonPhases> valueOf(int percent){
       List<MoonPhases> result = new ArrayList<>();

       int k = percent/25;
       if ((percent - k*25) > 13) k++;

       for (MoonPhases phase : MoonPhases.values())
           if (phase.percent == k*25)
               result.add(phase);

        return result;
    }

    public static boolean has(String name){
        if(name == null || name.isEmpty()) {
            return false;
        }
        for (MoonPhases phase : MoonPhases.values()){
            if(phase.name().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
