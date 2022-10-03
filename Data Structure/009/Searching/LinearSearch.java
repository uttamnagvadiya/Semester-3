import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int [10];

        for (int i=0; i<10; i++){
            System.out.printf("Enter Element : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter you want to Search Element : ");
        int search = sc.nextInt();

        System.out.print("Your Element is at ");
        for (int j=0; j<10; j++){
            if(arr[j] == search){
                System.out.print(j+", ");
            }
        }
        System.out.print("Index/es.");
           
        sc.close();
    }
}
