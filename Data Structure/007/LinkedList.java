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

    public void sortLinkedList(Node head) {
        Node temp = head;
        int result = 0;
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
