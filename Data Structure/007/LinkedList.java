import java.util.Scanner;

class List{
    Node head;
    public static class Node{
        int value;
        Node nextAddress;

        public Node(int value){
            this.value = value;
            nextAddress = null;
        }
    }

   public void insertElement(int value){
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

    // public int deleteElement(){

    // }

    void sortLinkedList(Node head) {
        Node current = head;
        Node index = null;
        int temp;

        if (head == null) {
            return;
        } else {
            while (current != null) {

                index = current.nextAddress;

                while (index != null) {
                    if (current.value > index.value) {
                        temp = current.value;
                        current.value = index.value;
                        index.value = temp;
                    }
                    index = index.nextAddress;
                }
                current = current.nextAddress;
            }
        }
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
                    obj.insertElement(sc.nextInt());
                    break;

                case 2:
                    // System.out.println(obj.deleteElement);    
                    break;

                case 3: 
                    obj.displayList();
                    break;

                case 4:
                    obj.sortLinkedList(obj.head);
                    break;
                
                default:
                    break;
            }
        }
        
    }
}
