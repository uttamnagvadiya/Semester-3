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
        if (index <= -1 || index >= 10){
            System.out.println("Invalid Enter the Index...");
            return 0;
        }
        else{
            return stack[index];
        }
        
    }

    public void change(int cngeIndex, int cngeValue){
        if (cngeIndex <= -1 || cngeIndex >= 10 || top <= -1){
            System.out.println(" Entered the Index is Invalid... ");
        }
        else{
            stack[cngeIndex] = cngeValue;
            System.out.println("-->> Vlaue Changed Successfully... ");
        }
    }
    public void displayStack(){
        System.out.print("Stack : [");
        for(int i=0; i<top+1; i++){
            System.out.print(stack[i]+", ");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {

        Stack st = new Stack();

        Scanner sc = new Scanner(System.in);
        
        System.out.println(" Operations are : \n 1 --> Push Element\n 2 --> Pop Element\n 3 --> Peek Element\n 4 --> Peep Element\n 5 --> Change Element\n 6 --> Display Elements\n 7 --> Exit");
        while(true){
            System.out.print("Enter Option you want to perform : ");
            switch(sc.next()){
                case "1" :
                    System.out.print("Enter the Elements in Stack : ");
                    st.push(sc.nextInt()); 
                    break;
    
                case "2" : 
                    System.out.println(st.pop());
                    break;

                case "3" : 
                    System.out.println(st.peek());
                    break;
    
                case "4" :
                    System.out.print("Enter Index : ");
                    int index = sc.nextInt();
                    System.out.println(st.peep(index));
                    break;
    
                case "5" :
                    System.out.print("Enter Index :");
                    int cngeIndex = sc.nextInt();
                    System.out.print("Enter Value : ");
                    int cngeValue = sc.nextInt();
                    st.change(cngeIndex, cngeValue);
                    break;
    
                case "6" :
                    st.displayStack();
                    break;
    
                case "7" :
                    System.exit(0);
                    break;
            }
        }

    }
}
