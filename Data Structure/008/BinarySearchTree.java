import java.util.*;

class BST{
    Node root;

    public static class Node{
        double value;
        Node leftSide, rightSide;

        public Node(double value){
            this.value = value;
            leftSide = null;
            rightSide = null;
        }
    }


    //  Insert the Node

    public void insert(double value){
        Node newNode = new Node(value);
        if (root == null)
            root = newNode;
        else{
            Node temp = root;
            while (temp.leftSide!=null || temp.rightSide!=null) {

                if (newNode.value >= temp.value && temp.rightSide!=null)
                    temp = temp.rightSide;

                else if (newNode.value <= temp.value && temp.leftSide!=null)
                    temp = temp.leftSide;

                else
                    break;
            }

            if(newNode.value >= temp.value)
                temp.rightSide = newNode;
            else
                temp.leftSide = newNode;
        } 
    }


    //Delete Nodes

    public void deleteNodes(double data) {
        
        Node parent = null, temp = root;

        while(temp != null && temp.value != data){
            parent = temp;

            if(data > temp.value)
                temp = temp.rightSide;
            else
                temp = temp.leftSide;
        }


        // i> Delete Leaf Node.

        if (temp.leftSide == null && temp.rightSide == null){
            if (parent.value > temp.value)
                parent.leftSide = null;
            else
                parent.rightSide = null;
        }


        // ii> Delete Node with One Child.

        if (temp.leftSide != null && temp.rightSide == null){
            if (temp.value > parent.value)
                parent.rightSide = temp.leftSide;
            else
                parent.leftSide = temp.leftSide;
        } 

        if (temp.leftSide == null && temp.rightSide != null){
            if (temp.value > parent.value)
                parent.rightSide = temp.rightSide;
            else
                parent.leftSide = temp.leftSide;
        } 


        // iii> Delete Node with Two Child.

        if (temp.leftSide != null && temp.rightSide != null){
            Node u = inOrderSuccessor(temp);
            temp.value = u.value;
        }
        System.out.println("Node is Deleted Successfully!");
    }

    public Node inOrderSuccessor(Node x) {
        boolean rightChild = true;
        Node parent = x;
        x = x.rightSide;

        if (x.leftSide != null)
            rightChild = false;
        
        while (x.leftSide != null) {
            parent = x;
            x = x.leftSide;
        }

        if (rightChild)
            parent.rightSide = x.rightSide;
        else 
            parent.leftSide = x.rightSide;

        return x;
    }

    

    //  Display InOrder

    public void displayInorder() {
        if (root == null)
            System.out.println("Sorry! Binary Tree is Empty...");
        else{
            System.out.print("Display in InOrder : ");
            Node temp = root;
            Stack<Node> st = new Stack<Node>();

            while(temp != null || st.size()>0){

                while(temp != null){
                    st.push(temp);
                    temp = temp.leftSide;
                }

                temp = st.pop();
                System.out.print(temp.value+", ");
                temp = temp.rightSide;
            }
        }
        System.out.println();
    }


    //  Display PostOrder

    public void displayPostorder() {
        Stack<Node> st1 = new Stack<Node>();
        Stack<Node> st2 = new Stack<Node>();

        st1.push(root);
        System.out.print("Display in PostOrder : ");
        while (st1.size()>0) {
            Node temp = st1.pop();
            st2.push(temp);

            if(temp.leftSide != null)
                st1.push(temp.leftSide);
            if(temp.rightSide != null)
                st1.push(temp.rightSide);
        }

        while (st2.size()>0) {
            Node data = st2.pop();
            System.out.print(data.value+", ");
        }
        System.out.println();
    }


    //  Display PreOrder

    public void displayPreorder() {
        Stack<Node> st = new Stack<Node>();

        st.push(root);
        System.out.print("Display in PreOrder : ");

        while (st.size()>0) {
            Node temp = st.pop();
            System.out.print(temp.value+", ");

            if (temp.rightSide != null)
                st.push(temp.rightSide);
            if (temp.leftSide != null)
                st.push(temp.leftSide);
        }
        System.out.println();
    }
}

public class BinarySearchTree{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BST tr = new BST();
        while (true) {
            System.out.print("Enter the you want to perform Operation : ");
            switch (sc.nextInt()) {
                case 1:
                    System.out.print("Enter the Value : ");
                    tr.insert(sc.nextDouble());
                    break;

                case 2:
                    tr.displayInorder();
                    break;

                case 3:
                    tr.displayPostorder();
                    break;

                case 4:
                    tr.displayPreorder();
                    break;

                case 5:
                    System.out.print("Enter the Value : ");
                    tr.deleteNodes(sc.nextDouble());
            
                default:
                    break;
            }
        }
    }
}