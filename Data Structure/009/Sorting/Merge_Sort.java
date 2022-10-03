import java.util.Scanner;

public class Merge_Sort {

    public static void mergeArrays (int arr[], int low, int middle, int high) {
        int x = middle-low+1;
        int y = high-middle;
        //temp arrays.
        int left[] = new int [x];
        int right[] = new int [y];

        // Copy Elements to temp arrays.
        for (int i=0; i<x; i++)
            left[i] = arr[low+i];
        
        for (int j=0; j<y; j++)
            right[j] = arr[middle+1+j];

        
        //  Merge the temp arrays.
        int i=0, j=0, k=low;
        while (i < x && j < y) {
            if (left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        //  Copy Remaining Elements.
        while (i<x) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j<y) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void sortArrayByMergeSort(int arr[], int low, int high) {
        if (low < high){
            int middle = low + (high-low) / 2;

            sortArrayByMergeSort(arr, low, middle);
            sortArrayByMergeSort(arr, middle+1, high);

            mergeArrays(arr, low, middle, high);
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

        sortArrayByMergeSort(arr, 0, length-1);
        System.out.print("Sorted Array : ");
        for(int i=0; i<length; i++){
            System.out.print(arr[i]+" | ");
        }
    }
}
