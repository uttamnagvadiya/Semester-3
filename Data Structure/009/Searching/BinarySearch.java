import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [15];               //  Array is Sorted.
        for(int i=0; i<15;i++)
            arr[i] = 7*i;

        System.out.print("Enter you want to Search Element is Multiple of 7 : ");
        int search = sc.nextInt();
        int middle = arr.length/2;
        
        while(true){
            if (arr[middle] == search){
                System.out.println("Your Element is at Middle Point "+middle+" of the Array.");
                break;
            }
            else if (search > arr[middle]){
                if (search == arr[middle]){
                    System.out.println("Your Element is at "+middle+" Index of the Array.");
                    break;
                }
                middle++;
            }
            else if (search < arr[middle]){
                if (search == arr[middle]){
                    System.out.println("Your Element is at "+middle+" Index of the Array.");
                    break;
                }
                middle--;
            }
            else{
                System.out.println("Please! Enter the Search Element between 0 to 98.");
            }
        }
        sc.close();
    }
}
