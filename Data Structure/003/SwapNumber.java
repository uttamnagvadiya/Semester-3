import java.util.Scanner;

public class SwapNumber {
    
    Scanner sc = new Scanner(System.in);
    int x, y, z;

    public void swaping(){
        System.out.print("x = ");
        x = sc.nextInt();
        System.out.print("y = ");
        y = sc.nextInt();

        z = x;
        x = y;
        y = z;

        System.out.println("x = "+x+"\n"+"y = "+y);
    
    }
    public static void main(String[] args) {
        SwapNumber sp = new SwapNumber();
        sp.swaping();
    }
}
