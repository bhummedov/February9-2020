import java.util.Scanner;
public class Assignment6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What model would you like? X or Y :");
        String model = scanner.next();
        if (model.equals("X")) {
            System.out.println("Price for that car is: $30.000USD");
            System.out.println(" Would you like to add Body Package:");
            String BodyPackage = scanner.next();
            if (BodyPackage.compareToIgnoreCase("Y") == 0) {
                System.out.println("Body Package is :$5000 USD");
                System.out.println("Total will be: $35.000USD");
                System.out.println("How about adding Sound Package");
            } else if (BodyPackage.compareToIgnoreCase("N") == 0)
                System.out.println("How about adding Sound Package");
            String SoundPackage = scanner.next();
            if (SoundPackage.compareToIgnoreCase("Y") == 0) {
                System.out.println("Sound Package is :$3000 USD");
                System.out.println("Total will be: $33.000USD");
                if (BodyPackage.equals("Y") && SoundPackage.equals("Y"))
                    System.out.println("Your total will be with both packages: &38.000USD");
            } else if (SoundPackage.compareToIgnoreCase("N") == 0) {
                System.out.println("Total will be: $35.000USD");
                if (BodyPackage.equals("N") && SoundPackage.equals("N"))
                    System.out.println("Your total will be: &30.000USD");
            }
        }

        if (model.equals("Y")) {
            System.out.println("Price for that car is: $35.000USD");
            System.out.println(" Would you like to add Entertainment Package:");
            String EntertainmentPackage = scanner.next();
            if (EntertainmentPackage.compareToIgnoreCase("Y") == 0) {
                System.out.println("EntertainmentPackage is :$8000 USD");
                System.out.println("Total will be: $43.000USD");
                System.out.println("How about adding SafetyPackage");
            } else if (EntertainmentPackage.compareToIgnoreCase("N") == 0)
                System.out.println("How about adding Sound Package");
            String SafetyPackage = scanner.next();
            if (SafetyPackage.compareToIgnoreCase("Y") == 0) {
                System.out.println("SafetyPackage is :$4000 USD");
                System.out.println("Total will be: $39.000USD");
                if (EntertainmentPackage.equals("Y") && SafetyPackage.equals("Y"))
                    System.out.println("Your total will be with both packages: &47.000USD");
            } else if (SafetyPackage.compareToIgnoreCase("N") == 0) {
                System.out.println("Total will be: $43.000USD");
                if (EntertainmentPackage.equals("N") && SafetyPackage.equals("N"))
                    System.out.println("Your total will be: &35.000USD");

            }
        }
    }
}
















