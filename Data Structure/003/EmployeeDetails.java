import java.util.Scanner;

public class EmployeeDetails {
    
    Scanner sc = new Scanner(System.in);
    long emp_id; 
    String name, designation;
    double salary;

    public void setDetails(){
        System.out.print("Employee_ID : ");
        emp_id = sc.nextLong();
        System.out.print("Name : ");
        name = sc.next();
        System.out.print("Designation : ");
        designation = sc.next();
        System.out.print("Salary : ");
        salary = sc.nextDouble();
    }

    public void printDetails(){
        System.out.println("Employee_ID : "+emp_id);
        System.out.println("Name : "+name);
        System.out.println("Designation : "+designation);
        System.out.println("Salary : "+salary);
    }
    
    public static void main(String[] args) {
        EmployeeDetails emp = new EmployeeDetails();
        emp.setDetails();
        emp.printDetails();
    }
    
}
