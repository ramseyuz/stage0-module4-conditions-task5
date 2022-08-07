package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {

        String season; // season

        switch (month) {
            case (1):
            case (3):
            case (5):
            case (7):
            case (8):
            case (10):
            case (12):
                season = "31";
                break;
            case (4):
            case (6):
            case (9):
            case (11):
                season = "30";
                break;
            case (2):
                season = "28";
                break;

            default:
                season = "wrong number!";
                break;
        }
        System.out.println(season);
    }

}
