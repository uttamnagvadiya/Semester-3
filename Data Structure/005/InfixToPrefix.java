import java.util.*;
public class InfixToPrefix{

    static InfixToPrefix itp = new InfixToPrefix();

    static int top = -1;
    char [] operators = new char[100];


    public String toPostfix(String infix){
        

        char symbol;
        String postfix = "";

        for(int i=0; i<infix.length(); i++){
            symbol = infix.charAt(i);

            if (Character.isLetter(symbol)){
                postfix += symbol;
            }
            else if (symbol == ')'){
                itp.push(symbol);
            }
            else if ( symbol == '(' ){
                while(itp.peek() != ')'){
                    postfix += itp.pop();
                }
                itp.pop();
            }
            else{
                while (top != -1 && !( itp.peek() == ')' ) && precedence(symbol) <= precedence(itp.peek()) ){
                    postfix += itp.pop();
                } 
                itp.push(symbol);
            }
        }

        while (top != -1) {
            postfix += itp.pop();
        }
        return postfix;
    }


    // Pushing Operators in Stack.
    public void push(char pushSymbol){
        if (top >= 100){
            System.out.println("Stack Overflow...");
        }
        else{
            top++;
            operators[top] = pushSymbol;
        }
    }


    // Peek the Operators for checking precedence of Operators.
    public char peek(){
        if (top <= -1){
            System.out.println("Stack Underflow1...");
            return 0;
        }
        else{
            return operators[top];
        }
    }


    // Pop the Opearators in Stack.
    public char pop(){
        if (top <= -1){
            System.out.println("Stack Underflow2...");
            return 0;
        }
        return operators[top--];
    }


    // Check Precedence of Operators.
    public int precedence(char op){
        switch (op) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
            case '%':
                return 2;

            case '^':
                return 3;
        
            default:
                break;
        }
        return op;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Expression : ");
        String infix = sc.next();

        // Reverse the Entered Infix Expression
        String reverseString = "";
        for (int i=infix.length()-1; i>=0; i--) {
            reverseString += infix.charAt(i);
        }
        
        // Convert Reversed Infix Expression to Postfix Expression
        String output = itp.toPostfix(reverseString);

        // Reverse the Postfix Expression to Convert in Prefix Expression
        String resultReverseString = "";
        for (int i=output.length()-1; i>=0; i--) {
            resultReverseString += output.charAt(i);
        }
        System.out.println("Prefix Expression for the given Infix Expression is : "+resultReverseString);
    }
}
