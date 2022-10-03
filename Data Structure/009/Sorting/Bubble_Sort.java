import java.util.Scanner;

public class Bubble_Sort {

    public static void sortArrayByBubbleSort (int arr[] ) {

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        for(int i=0; i<arr.length; i++){
            System.out.printf("Enter Element : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Original Array : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" | ");
        }

        sortArrayByBubbleSort(arr);
        System.out.print("\nSorted Array : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" | ");
        }
        
    }
}
