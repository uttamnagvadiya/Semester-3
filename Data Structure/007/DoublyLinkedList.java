import java.util.Scanner;

class DoublyList{
    Node head, last;
    int count = 1;

    public static class Node{
        double value;
        Node prev, next;

        public Node(double value){
            this.value = value;
            prev = null;
            next = null;
        }
    }



    //      Menu

    public void menu(){
        System.out.println("\n 0 --> Menu\n 1 --> Insert Element at the First end of List.\n 2 --> Insert Element you want to Specific Position.\n 3 --> Insert Element at the Last end of List.");
        System.out.println(" 4 --> Delete Element at the First end of List.\n 5 --> Delete Element you want to Specific Value.\n 6 --> Delete Element at the Last end of List.");
        System.out.println(" 7 --> If you want to Shorten the List.\n 8 --> Counts the Node in your list. \n 9 --> Display the List.\n 10 -> You want to EXIT the Program.\n");
    }


    //  For Insertion...

    public void insertElementAtFirst (double value) {
        Node newNode = new Node (value);

        if (head == null){
            head = newNode;
            last = head;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        count++;
        System.out.println("Node is Inserted Successfully!");
    }

    public void insertElementAtSpecificPositiotn (double value, double afterValue) {
        Node newNode = new Node (value);

        Node temp = head;
        if (head == null)
            head = newNode;
        else{
            while(temp.value != afterValue){
                temp = temp.next;
            }
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next = newNode;
            newNode.next.prev = newNode;
            count++;
            System.out.println("Node is Inserted Successfully!");
        }
    }

    public void insertElementAtEnd (double value) {
        Node newNode = new Node (value);

        if (head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
            last = newNode;
            count++;
            System.out.println("Node is Inserted Successfully!");
        }
    }


    //  For Deletion...

    public void deleteElementAtFirst () {
        if (head == null)
            System.out.println("Sorry! you can not delete element because list is empty.");
        else{
            head = head.next;
            head.prev.next = null;
            head.prev = null;
            count--;
            System.out.println("Node is Deleted Successfully!");
        }
    }

    public void deleteSpecificElement (double value) {
        if (head == null)
            System.out.println("Sorry! you can not delete element because list is empty.");
        else if(head.value==value){
            head=head.next;
            count--;
            System.out.println("Node is Deleted Successfully!");
        }
        else{
            Node temp = head;
            while(temp.next != null){
                if (temp.value == value){
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                    count--;
                    System.out.println("Node is Deleted Successfully!");
                    break;
                }
                temp = temp.next;
            }
            if(temp.next == null)
                System.out.println("Node not Found...");
        }
    }

    public void deleteElementAtEnd () {
        if (head == null)
            System.out.println("Sorry! you can not delete element because list is empty.");
        else{
            Node temp = head;
            while(temp.next != null)
                temp = temp.next;
            
            last = temp.prev;
            temp.prev.next = null;
            count--;
            System.out.println("Node is Deleted Successfully!");
        }
    }


    //  For Sorted List...

    public void sortLinkedList(Node head) {
        Node temp = head;
        double result = 0;
        while(temp != null){
            Node newTemp = temp.next;
            while(newTemp != null){
                if (temp.value > newTemp.value){
                    result = temp.value;
                    temp.value = newTemp.value;
                    newTemp.value = result;
                }
                newTemp = newTemp.next;
            }
            temp = temp.next;
        }
        System.out.println("List Sorted Successfully...");
    }


    //  For Count the Nodes...

    public int nodeCount(){
        if (head == null)
            return 0;
        else{
            return count;
        }
    }


    // For Display Lists...

    public void displayDoublyList () {

        Node temp = head;
        System.out.print("Sequential List : ");
        while(temp != null){
            System.out.print(temp.value);
            if (temp.next != null)
                System.out.print(" <=> ");
            temp = temp.next;
        }

        System.out.print("\nReverse List : ");
        Node tail = last;
        while(tail != null){
            System.out.print(tail.value);
            if (tail.prev != null)
                System.out.print(" <=> ");
            tail = tail.prev;
        }
        System.out.println();
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        DoublyList obj = new DoublyList();
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
                    double enterValue = sc.nextDouble();
                    System.out.print("Enter the value after which you want to insert : ");
                    double afterValue = sc.nextDouble();
                    obj.insertElementAtSpecificPositiotn(enterValue, afterValue);
                    break;

                case 3:
                    System.out.print("Enter the Value : ");
                    obj.insertElementAtEnd(sc.nextDouble());
                    break;


                // //  Deleted Case

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
                    obj.displayDoublyList();
                    break;

                case 10:
                    System.exit(0);

                default:
                    System.out.println("Please! Enter the Number between '0 - to - 10' ");
                    break;
            }
        }
    }
}
