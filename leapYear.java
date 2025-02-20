import java.util.Scanner;

public class Main {
    public static void main(String[] Args) {

        int year;

        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a year: ");
        year = scanner.nextInt();

        
        if (year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else if (year % 100 == 0) {
            System.out.println(year + " is not a leap year.");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        // Close the scanner
        scanner.close();
    }
}

