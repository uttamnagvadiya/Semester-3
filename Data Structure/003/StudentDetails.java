import java.util.Scanner;

public class StudentDetails {

    int index=0, sem;
    long enrollmentNo;
    String name;
    float cpi;

    Scanner sc = new Scanner(System.in);


    StudentDetails(int index, long enrollmentNo, String name, int sem, float cpi){
        this.index = index;
        this.enrollmentNo = enrollmentNo;
        this.name = name;
        this.sem = sem;
        this.cpi = cpi; 
    }

    public void printDetials(){
        System.out.println("------------- Student - "+index);
        System.out.println("Enrollment No : "+enrollmentNo);
        System.out.println("Name : "+name);
        System.out.println("Semester : "+sem);
        System.out.println("CPI : "+cpi);
        System.out.println();
    }

    public static void main(String[] args) {

        StudentDetails [] std = new StudentDetails[5];
        
        std[0] = new StudentDetails(1, 123456, "uttam", 3, 8.30f);
        std[1] = new StudentDetails(2, 456789, "kishan", 3, 7.45f);
        std[2] = new StudentDetails(3, 789123, "karan", 3, 8.56f);
        std[3] = new StudentDetails(4, 465132, "devanshu", 3, 9.30f);
        std[4] = new StudentDetails(5, 987456, "divyank", 3, 6.85f);

        for(int j=0; j<std.length; j++){
            std[j].printDetials();
        }
    }
}
