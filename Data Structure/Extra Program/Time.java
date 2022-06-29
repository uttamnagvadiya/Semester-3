import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        int hour, minute, second;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Seconds : ");
        second = sc.nextInt();

        System.out.println(second+" Seconds...");

        hour = second / 3600;
        second = second % 3600;
        minute = second / 60;
        second = second % 60;

        System.out.println(hour+" : "+minute+" : "+second);
    }
}
