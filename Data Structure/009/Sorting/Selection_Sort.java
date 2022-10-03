import java.util.Scanner;

public class Selection_Sort{

    public static void sortArrayBySelectionSort (int arr[] ) {
        
        for(int i=0; i<arr.length; i++){
            int index = i;

            for(int j=i+1; j<arr.length; j++){
                if (arr[j] < arr[index])
                    index = j;
            }
            int small = arr[index];
            arr[index] = arr[i];
            arr[i] = small;
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

        sortArrayBySelectionSort(arr);
        System.out.print("\nSorted Array : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" | ");
        }
        
    }
}