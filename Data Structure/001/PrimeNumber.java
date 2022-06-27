import java.util.*;
public class PrimeNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number = ");
        int x = input.nextInt();
        int y=0;

        for(int i=2; i<=(x/2); i++){
            if (x % i == 0){
                y = 1;
                break;
            }
        }
        if (y == 0){
            System.out.println("This Number is Prime Number");
        }
        else{
            System.out.println("This Number is Not Prime Number");
        }
    }
}
