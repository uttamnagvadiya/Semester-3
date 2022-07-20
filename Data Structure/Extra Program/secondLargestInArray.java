public class secondLargestInArray {

    public static void main(String[] args) {
        int demo [] = {65,321,654,3,8,51,356};

        int max = demo[0], secondMax = demo[0];

        for (int i = 0; i < demo.length; i++) {
            if (max < demo[i]) {
                secondMax = max;
                max = demo[i];
            }
            else if (secondMax < demo[i]) {
                secondMax = demo[i];
            }
        }
        System.out.println("Second Largest Element in Array : "+secondMax);
    }
}

