import java.util.*;

public class AdditionOfMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows = ");
        int m = sc.nextInt();
        System.out.print("Column = ");
        int n = sc.nextInt();
 
        int [][] mat1 = new int [m][n];
        int [][] mat2 = new int [m][n];
        int [][] mat3 = new int [m][n];

        for (int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.format("Element of mat1 [%d][%d] = ", i+1, j+1);
                mat1[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.format("%3d", mat1[i][j]);
            }
            System.out.println();
        }

        for (int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.format("Element of mat2 [%d][%d] = ", i+1, j+1);
                mat2[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.format("%3d", mat2[i][j]);
            }
            System.out.println();
        }

        System.out.println("------ Addition of Matrix(1) & Matrix(2):");
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                mat3[i][j] = mat1[i][j] + mat2[i][j];
                System.out.printf("%3d", mat3[i][j]);
            }
            System.out.println("");
        } 

    }
}
