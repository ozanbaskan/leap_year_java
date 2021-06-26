import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int year;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a year: ");
        year = s.nextInt();

        if (year < 0 || year > 100_000_000)
        {
            System.out.println("Invalid entry.");
        }
        else
        {
            if (year % 400 == 0)
            {
                System.out.printf("%d bir artık yıldır!", year);
            }
            else if (year % 100 == 0)
            {
                System.out.printf("%d bir artık yıl değildir!", year);
            }
            else if (year % 4 == 0)
            {
                System.out.printf("%d bir artık yıldır!", year);
            }
            else
            {
                System.out.printf("%d bir artık yıl değildir!", year);
            }
        }
    }

}
