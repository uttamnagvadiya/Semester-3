import java.util.*;

public class ReplaceArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        int [] demo = new int [n];

        for (int i=0; i<demo.length; i++) {
            System.out.print("Value of index "+ i +" : ");
            demo[i] = sc.nextInt();
        }

        System.out.println();
        System.out.print("Value to Match = ");
        int matchValue = sc.nextInt();
        System.out.print("Value to Update = ");
        int updateValue = sc.nextInt();

        int flag = 0;

        for (int i=0; i<demo.length; i++){
            if (demo[i] == matchValue){
                demo[i]=updateValue;
                System.out.println("Updated Index is "+ i + " and Updated Value for this Index is demo["+i+"] = "+demo[i]);
            }
            else{
                flag++;
            }
        }
        
        if (flag == demo.length){
            System.out.println("The Value is not Updated because Value of any particular index is not Matched !");
        }
        
    }
}
