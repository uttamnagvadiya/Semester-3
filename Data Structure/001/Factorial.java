import java.util.*;

class Facto{
    //Using Recursion
    public int factorial (int x) {
        if (x == 1){
            return 1;
        }
        else{
            return x*factorial(x-1);
        }

    }
}

public class Factorial {
    public static void main(String[] args) {
        int fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();

        // Using Loop
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        System.out.println("Factorial of this Number uisng loop : "+fact);


        Facto f = new Facto();
        System.out.println("Factorial of this Number using Recursion : "+f.factorial(n));


    }    
}