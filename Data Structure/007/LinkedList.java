import java.util.Scanner;

class List{
    Node head;
    int count = 1;
    public static class Node{
        double value;
        Node nextAddress;

        public Node(double value){
            this.value = value;
            nextAddress = null;
        }
    }


//      Menu
    public void menu(){
        System.out.println("\n 0 --> Menu\n 1 --> Insert Element at the First end of List.\n 2 --> Insert Element you want to Specific Position.\n 3 --> Insert Element at the Last end of List.");
        System.out.println(" 4 --> Delete Element at the First end of List.\n 5 --> Delete Element you want to Specific Value.\n 6 --> Delete Element at the Last end of List.");
        System.out.println(" 7 --> If you want to Shorten the List.\n 8 --> Counts the Node in your list. \n 9 --> Display the List.\n 10 -> You want to EXIT the Program.\n");
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
        count++;
        System.out.println("Node is Inserted Successfully!");
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
            count++;
            System.out.println("Node is Inserted Successfully!");
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
            count++;
            System.out.println("Node is Inserted Successfully!");
        }
    }



//      For Delete Element

    public void deleteElementAtFirst(){
        if (head == null)
            System.out.println("Sorry! you can not delete element because list is empty.");
        else{
            head = head.nextAddress;
            count--;
            System.out.println("Node is Deleted Successfully!");
        }
    }
    
    public void deleteSpecificElement(double value) {
        if (head == null)
            System.out.println("Sorry! you can not delete element because list is empty.");
        else if(head.value==value)
            head=head.nextAddress;
        else{
            Node temp = head;
            while(temp.nextAddress != null){
                if (temp.nextAddress.value == value){
                    temp.nextAddress = temp.nextAddress.nextAddress;
                    count--;
                    System.out.println("Node is Deleted Successfully!");
                    break;
                }
                temp = temp.nextAddress;
            }
            if(temp.nextAddress == null)
                System.out.println("Node not Found...");
        }
    }

    public void deleteElementAtEnd(){
        if (head == null)
            System.out.println("Sorry! you can not delete element because list is empty.");
        else{
            Node temp = head;
            while(temp.nextAddress.nextAddress != null)
                temp = temp.nextAddress;
            
            temp.nextAddress = null;
            count--;
            System.out.println("Node is Deleted Successfully!");
        }
    }

//      For List is Sorted

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


//      Count the Node
    public int nodeCount(){
        if (head == null)
            return 0;
        else{
            return count;
        }
    }


//      Display the List
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
        obj.menu();
        while (true){
            System.out.print("Enter the you want to perform Operation : ");
            switch (sc.nextInt()) {
                case 0:
                    obj.menu();
                    break;

                //  Inserted Case

                case 1:
                    System.out.print("Enter the Value : ");
                    obj.insertElementAtFirst(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter the value you want to enter : ");
                    double enteredValue = sc.nextDouble();
                    System.out.print("Enter the value after which you want to insert : ");
                    double afterValued = sc.nextDouble();
                    obj.insertElementAtSpecificPositiotn(enteredValue, afterValued);
                    break;

                case 3:
                    System.out.print("Enter the Value : ");
                    obj.insertElementAtEnd(sc.nextDouble());
                    break;


                //  Deleted Case

                case 4:
                    obj.deleteElementAtFirst();    
                    break;

                case 5:
                    System.out.print("Enter the value you want to delete : ");
                    obj.deleteSpecificElement(sc.nextDouble());
                    break;
                    
                case 6:
                    obj.deleteElementAtEnd();    
                    break;
                    

                case 7:
                    obj.sortLinkedList(obj.head);
                    break;
    
                case 8:
                    System.out.println("--> "+obj.nodeCount()+" Nodes are available in list.");
                    break;
                    
                case 9: 
                    obj.displayList();
                    break;

                case 10:
                    System.exit(0);

                default:
                    System.out.println("Please! Enter the Choice between '0 - to - 10' ");
                    break;
            }
        }
        
    }
}
