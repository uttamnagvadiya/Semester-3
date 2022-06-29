import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        int year, week, day;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Days : ");
        day = sc.nextInt();

        System.out.println(day+" Days...");

        year = day / 365;
        day = day % 365;
        week = day / 7;
        day = day % 7;

        System.out.println(year+" Year, "+week+" Week, "+day+" Days");

    }
}
