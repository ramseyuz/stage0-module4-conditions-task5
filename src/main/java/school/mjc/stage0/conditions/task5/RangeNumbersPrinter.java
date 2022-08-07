package school.mjc.stage0.conditions.task5;

public class RangeNumbersPrinter {
    public void printRange(int number) {

        String output; // season

        switch (number) {
            case (1):
            case (2):
            case (3):
            case (4):
            case (5):

                output = "number is between 1 and 5";
                break;
            case (6):
            case (7):
            case (8):
            case (9):
            case (10):
                output = "number is between 6 and 10";
                break;

            default:
                output = "out of range";
                break;
        }
        System.out.println(output);

    }
}
