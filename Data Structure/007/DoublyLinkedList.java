import java.util.Scanner;

class Doubly{
    Node head;

    class Node {
        int value;
        Node next, prev;

        public Node (int value){
            this.value = value;
            next = null;
            prev = null;
        }
    }

    public void insert(int value){
        Node newNode = new Node(value);
        
        if(head == null)
            head = newNode;
        else{
            Node temp = head;

            while(temp.next != null){
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
}

public class DoublyLinkedList{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Doubly db = new Doubly();

        while(true){
            System.out.println("Enter Choice : ");
            System.out.println("1 : insert ");
            System.out.println("2 : display ");
            System.out.println("3 : Quit ");
            int op = sc.nextInt();

            switch(op){
                case 1 :
                    System.out.print("Enter Value : ");
                    db.insert(sc.nextInt());
                    break;

                case 2 :
                    db.display();
                    break;

                case 3 :
                    System.exit(0);
                    break;

                default :
                    System.out.println("Enter valid Choice...!! ");				
            }
        }
    }
}
