import java.util.*;

//  Evalute Expression.
class EvalutionOfExpression {
    static EvalutionOfExpression epe = new EvalutionOfExpression();             // reference epe means => evalution of postfix expression.
    int top = -1;
    double [] evaluteStack = new double[15];

    public double evalutePostfixExp (String resultExp) {

        char symbol;

        for (int i=0; i<resultExp.length(); i++) {
            symbol = resultExp.charAt(i);

            if (Character.isDigit(symbol)) {
                epe.digitPush(symbol-'0');
            }
            else {
                double oprand_1 = epe.digitPop();
                double oprand_2 = epe.digitPop();

                switch (symbol) {
                    case '+':
                        epe.digitPush(oprand_2+oprand_1);
                        break;

                    case '-':
                        epe.digitPush(oprand_2-oprand_1);
                        break;

                    case '*':
                        epe.digitPush(oprand_2*oprand_1);
                        break;

                    case '/':
                        epe.digitPush(oprand_2/oprand_1);                        
                        break;

                    case '%':
                        epe.digitPush(oprand_2%oprand_1);
                        break;

                    case '^':
                        epe.digitPush(Math.pow(oprand_2, oprand_1));
                        break;
                
                    default:
                        break;
                }
            }
        }
        return epe.digitPop();
    }


    public void digitPush(double digit) {
        if (top >= 15){
            System.out.println("Stack Overflow...");
        }
        else{
            top++;
            evaluteStack[top] = digit;
        }
    }

    public double digitPop() {
        if (top <= -1){
            System.out.println("Stack Underflow...");
            return 0;
        }
        return evaluteStack[top--];
    }

}



//  Convert Infix to Postfix.
public class EvalutionOfPostfixExp{

    static EvalutionOfPostfixExp itp = new EvalutionOfPostfixExp();     // reference itp means => infix to postfix

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
            else if (symbol == '('){
                itp.push(symbol);
            }
            else if ( symbol == ')' ){
                while(itp.peek() != '('){
                    postfix += pop();
                }
                itp.pop();
            }
            else{
                while (top != -1 && !( itp.peek() == '(' ) && precedence(symbol) <= precedence(itp.peek()) ){
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
            System.out.println("Stack Underflow...");
            return 0;
        }
        else{
            return operators[top];
        }
    }


    // Pop the Opearators in Stack.
    public char pop(){
        if (top <= -1){
            System.out.println("Stack Underflow...");
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
        EvalutionOfExpression epe = new EvalutionOfExpression();
        System.out.print("Enter the Expression : ");
        String infix = sc.next();
        String output = itp.toPostfix(infix);
        System.out.println("Postfix Expression for the given Infix Expression is : "+output);
        System.out.println("Answer of Postfix Expression : " + epe.evalutePostfixExp(output));
    }
}

