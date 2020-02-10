import java.util.Scanner;
public class Assigment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you subscribed or not:");
        String sample = scanner.next();
        if (sample.equals("Y")) {
            System.out.println("What usage you would like to get:");
            int usage = scanner.nextInt();
            if (usage > 0 && usage < 100) {
                System.out.println("usage = 10USD");
            } else if (usage == 100) {
                System.out.println("usage = 40USD");
            }
        } else if (sample.equals("N")) {
            System.out.println("Please visit subscription page");
        } else if (!(sample.compareToIgnoreCase("Y or N") == 0)) {
            System.out.println("Please enter Y or N");

        }
    }
}

