import java.util.Scanner;

class checkTheString{
    int top = -1;
    char [] stack = new char[100];
    int x=0, y=0;


    public void push(char c){
        if (top > 99){
            System.out.println("Stack is Overflow...");
        }
        else{
            top++;
            stack[top] = c;
        }
    }

    public char pop(){
        if (top <= -1){
            System.out.println("Stack is Underflow...");
        }
        char element = stack[top];
        top--;
        return element;
    }

    public void result(int len){
        for (int i=0; i<len; i++){
            char character = pop();
            if (character == 'a')
                x++;
            else if (character == 'b')
                y++;
        }
        if (x == y)
            System.out.println("String is Valid.");
        else
            System.out.println("String is InValid.");
    }
}
public class ai_bi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        checkTheString cts = new checkTheString();

        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        
        for (int i=0; i<str.length(); i++){
            cts.push(str.charAt(i));
        }

        cts.result(str.length());
    }
}