import java.util.Scanner;

public class Insertion_Sort {

    public static void sortArrayByInsertionSort (int arr[]) {

        for (int i=1; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;

            while ((j > -1) && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        int length = arr.length;
        for(int i=0; i<length; i++){
            System.out.printf("Enter Element : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Original Array : ");
        for(int i=0; i<length; i++){
            System.out.print(arr[i]+" | ");
        }
        System.out.println();

        sortArrayByInsertionSort(arr);
        System.out.print("Sorted Array : ");
        for(int i=0; i<length; i++){
            System.out.print(arr[i]+" | ");
        }
    }
}
