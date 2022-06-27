import java.util.*;

public class MultiplicationOfMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows of Matrix(1) = ");
        int m = sc.nextInt();
        System.out.print("Enter Columns of Matrix(1) & Rows of Matrix(2) = ");
        int n = sc.nextInt();
        System.out.print("Enter Columns of Matrix(2) = ");
        int t = sc.nextInt();

        int [][] mat1 = new int [m][n];
        int [][] mat2 = new int [n][t];
        int [][] mat3 = new int [m][t];

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

        for (int i=0; i<n; i++){
            for(int j=0; j<t; j++){
                System.out.format("Element of mat2 [%d][%d] = ", i+1, j+1);
                mat2[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<n; i++){
            for(int j=0; j<t; j++){
                System.out.format("%3d", mat2[i][j]);
            }
            System.out.println();
        }

        System.out.println("------ Multiplication of Matrix(1) & Matrix(2):");
        for (int i=0; i<m; i++){
            for (int j=0; j<t; j++){
                for (int k=0; k<n; k++){
                    mat3[i][j] += mat1[i][k] * mat2[k][j];
                }
                System.out.format("%3d ", mat3[i][j]);
            }
            System.out.println("");
        } 
 
    }
}
