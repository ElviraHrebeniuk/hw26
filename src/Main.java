import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        printMoonPhases();
        System.out.println("------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фазу луны:");
        String search = scanner.nextLine();

        printPercent(MoonPhases.valueOf(search));
        System.out.println("---------------");
        System.out.println("Введите процент освещенности луны:");
        int percent = scanner.nextInt();
        System.out.println("Процент освещенности соответствует фазам:");

        List<MoonPhases> phasesList  = MoonPhases.valueOf(percent);
        for (MoonPhases phase : phasesList ){
            System.out.println(phase);
        }
    }

    public static void printMoonPhases(){
        for (MoonPhases phase : MoonPhases.values()){
            System.out.println(phase);
        }
    }

    public static void printPercent(MoonPhases phase){

        switch (phase) {
            case NEW_MOON -> System.out.println("\uD83C\uDF1A " + MoonPhases.NEW_MOON.getPercent()+"% ");
            case WAXING_MOON -> System.out.println("\uD83C\uDF12 " + MoonPhases.WAXING_MOON.getPercent()+"%  ");
            case FIRST_QUARTER -> System.out.println("\uD83C\uDF13 "+MoonPhases.FIRST_QUARTER.getPercent()+"%  ");
            case WAXING_GIBBOUS -> System.out.println("\uD83C\uDF14 "+MoonPhases.WAXING_GIBBOUS.getPercent()+"%  ");
            case FULL_MOON -> System.out.println("\uD83C\uDF15 "+MoonPhases.FULL_MOON.getPercent() + "%  ");
            case WANING_GIBBOUS -> System.out.println("\uD83C\uDF16 "+MoonPhases.WANING_GIBBOUS.getPercent()+"%  ");
            case LAST_QUARTER -> System.out.println("\uD83C\uDF17 "+MoonPhases.LAST_QUARTER.getPercent()+"%  ");
            case WANING_CRESCENT -> System.out.println("\uD83C\uDF18 "+MoonPhases.WANING_CRESCENT.getPercent()+"%  ");
            default ->  System.out.println("Некорректные данные");
        }
    }
}