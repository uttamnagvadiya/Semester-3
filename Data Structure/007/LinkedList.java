import java.util.Scanner;

class List{
    Node head;
    public static class Node{
        double value;
        Node nextAddress;

        public Node(double value){
            this.value = value;
            nextAddress = null;
        }
    }

    
//      For Insert Element

    public void insertElementAtFirst(double value){
        Node newNode = new Node(value);
        if (head == null)
            head = newNode;
        else{
            Node New = newNode;
            New.nextAddress = head;
            head = New;
        }
        System.out.println("Inserted Successfully!");
    }

    public void insertElementAtSpecificPositiotn(double value, double afterValued) {
        Node newNode = new Node(value);
        Node temp = head;
        if (head == null)
            head = newNode;
        else{
            while(temp.value != afterValued){
                temp = temp.nextAddress;
            }
            newNode.nextAddress = temp.nextAddress;
            temp.nextAddress = newNode;
            temp = newNode;
            System.out.println("Inserted Successfully!");
        }
    }

   public void insertElementAtEnd(double value){
        Node newNode = new Node(value);
        if (head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while (temp.nextAddress != null){
                temp = temp.nextAddress;
            }
            temp.nextAddress = newNode;
        }
    }



//      For Delete Element

    public void deleteElementAtFirst(){
        if (head == null)
            System.out.println("Sorry! you can not delete element because list is empty.");
        else{
            head = head.nextAddress;
        }
    }

    public void deleteSpecificElement(double value) {
        if (head == null)
            System.out.println("Sorry! you can not delete element because list is empty.");
        else{
            Node temp = head;
            Node pred = temp;
            while(temp.value != value){
                pred = temp;
                temp = temp.nextAddress;
            }
            pred.nextAddress = temp.nextAddress;
        }
    }

    public void sortLinkedList(Node head) {
        Node temp = head;
        double result = 0;
        while(temp != null){
            Node newTemp = temp.nextAddress;
            while(newTemp != null){
                if (temp.value > newTemp.value){
                    result = temp.value;
                    temp.value = newTemp.value;
                    newTemp.value = result;
                }
                newTemp = newTemp.nextAddress;
            }
            temp = temp.nextAddress;
        }
        System.out.println("List Sorted Successfully...");
    }

    public void displayList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.nextAddress;
        }
    }

    

}


public class LinkedList{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        List obj = new List();
        
        while (true){
            System.out.print("Enter the you want to perform Operation : ");
            switch (sc.nextInt()) {
                case 1:
                    System.out.print("Enter the Value : ");
                    obj.insertElementAtEnd(sc.nextDouble());
                    break;

                case 2:
                    obj.deleteElementAtFirst();    
                    break;


                case 3: 
                    obj.displayList();
                    break;

                case 4:
                    obj.sortLinkedList(obj.head);
                    break;

                case 5:
                    System.out.print("Enter the Value : ");
                    obj.insertElementAtFirst(sc.nextDouble());
                    break;

                case 6:
                    System.out.print("Enter the value you want to enter : ");
                    double enteredValue = sc.nextDouble();
                    System.out.print("Enter the value after which you want to insert : ");
                    double afterValued = sc.nextDouble();
                    obj.insertElementAtSpecificPositiotn(enteredValue, afterValued);
                    break;

                case 7:
                    System.out.print("Enter the value you want to delete : ");
                    obj.deleteSpecificElement(sc.nextDouble());
                
                case 10:
                    System.exit(0);
                default:
                    break;
            }
        }
        
    }
}
