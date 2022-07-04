import java.util.Scanner;

public class Stack {
    int[] stack = new int[10];
    int top = -1;

    public void push(int pushElement){
        if(top >= 10){
            System.out.println("Stack is Overflow...");
        }
        else{
            top++;
            stack[top] = pushElement;
        }
    }

    public int pop(){
        if(top <= -1){
            System.out.println("Stack is Underflow...");
            return 0;
        }
        else{
            return stack[top--];
        }

    }

    public int peek(){
        if(top <= -1){
            System.out.println("Stack is Underflow...");
            return 0;
        }
        else{
            return stack[top];
        }
    }

    public int peep(int index){
        if (index <= -1 || index >= 8){
            System.out.println("Invalid Enter the Index...");
            return 0;
        }
        else{
            return stack[top-index+1];
        }
        
    }

    public void change(int cngeIndex, int cngeValue){
        if (cngeIndex <= -1 || cngeIndex >= 8){
            System.out.println("Invalid Enter the Index : ");
        }
        else{
            stack[cngeIndex] = cngeValue;
        }
    }
    public void displayStack(){
        System.out.print("Stack : [");
        for(int i=0; i<stack.length; i++){
            System.out.print(stack[i]+", ");
        }
        System.out.print("]");
    }
    public static void main(String[] args) {

        Stack st = new Stack();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Option you want to perform : ");

        while(true){
            switch(sc.nextInt()){
                case 1 :
                    System.out.print("Enter the Elements in Stack : ");
                    st.push(sc.nextInt()); 
                    break;
    
                case 2 : 
                    System.out.println(st.pop());
                    break;
    
                case 3 :
                    System.out.print("Enter Index : ");
                    int index = sc.nextInt();
                    st.peep(index);
                    break;
    
                case 4 :
                    System.out.print("Enter Index :");
                    int cngeIndex = sc.nextInt();
                    System.out.print("Enter Value : ");
                    int cngeValue = sc.nextInt();
                    st.change(cngeIndex, cngeValue);
                    break;
    
                case 5 :
                    st.displayStack();
                    break;
    
                case 6 :
                    System.exit(0);
                    break;
            }
        }

    }
}
