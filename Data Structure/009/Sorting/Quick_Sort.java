import java.util.Scanner;

public class Quick_Sort {

    public static void sortArrayByQuickSort (int arr[], int low, int high) {
        if (low < high){
            int location = partition(arr, low, high);

            sortArrayByQuickSort(arr, low, location-1);
            sortArrayByQuickSort(arr, location+1, high);
        }
    }
    

    public static int partition (int arr[], int low, int high) {

        // ----------- Type - 1 ------------

        int pivot = arr[low];
        int i = low, j = high;

        while(i < j){
            while(arr[i] <= pivot){
                if (i==9) break;
                i++;
            }

            while(arr[j] > pivot)
                j--;

            if (i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;


        // ------------ Type - 2 ----------------

        /*boolean flag = true;
        if (low < high){
            int i = low;
            int j = high + 1;
            int key = arr[low];

            while(flag){
                i++;
                while (arr[i] < key) {
                    if (i == 9) break;
                    i++;
                }
                j--;
                while (arr[j] > key) {
                    j--;
                }

                if (i < j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                else
                    flag = false;
            }

            int newTemp = arr[low];
            arr[low] = arr[j];
            arr[j] = newTemp; 
            return j;
        }
        return high;*/

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
        sortArrayByQuickSort(arr, 0, length-1);
        System.out.print("Sorted Array : ");
        for(int i=0; i<length; i++){
            System.out.print(arr[i]+" | ");
        }
    }
}
