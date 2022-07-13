// import java.util.Scanner;
// public  class  InfixToPostfix{
//     static InfixToPostfix obj=new InfixToPostfix();
//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner(System.in);
//         String infix;
//         System.out.println("Enter the infix expression you want to convert: ");  
//         infix =sc.nextLine();
//         System.out.println("Postfix expression for the given infix expression is:" + obj.toPostfix(infix));
//     }
//     static int top=-1;
//     char[] ch= new char[100];
    
//     public void push(char c)
//     {
//         if(top>=100){
//             System.out.println("Overflow");
//         }
//         else{
//             top++;
//             ch[top]=c;
//         }
//     }
//     public char peek(){
//         if (top<=-1) {
//             System.out.println("UnderFlow");
//             return 0;
//         }
//         else{
//             return ch[top];
//         }

//     }
//     public char pop(){
// 		if(top==-1){
// 			System.out.println("Underflow");
// 			return 0;
// 		}
// 		return ch[top--];
// 	}
//     public  String toPostfix(String infix)  
//     {  
//         char symbol;  
//         String postfix = "";  

//         for(int i=0;i<infix.length();++i)  
//         {  
//             symbol = infix.charAt(i);  

//             if (Character.isLetter(symbol)) 
//                 postfix = postfix + symbol;  
//             else if (symbol=='(')  
//             {  
//                 obj.push(symbol);  
//             }  
//             else if (symbol==')'){  
//                     while (obj.peek() != '('){  
//                         postfix = postfix + pop();  
//                     }  
//                     obj.pop();
//             }  
//             else{  
//                     while (top!=-1 && !(obj.peek()=='(') && precedenc(symbol) <= precedenc(obj.peek()))  
//                         postfix = postfix + obj.pop();  
//                         obj.push(symbol);  
//                 }  
//         } 

//         while (top!=-1)
//             postfix = postfix + obj.pop();  
//         return postfix;  
//     }  
//     public int precedenc(char chr){
//         switch (chr) {
//             case '+':
//             case '-':
//                 return 1;
//             case '*':
//             case '/':
//                 return 2; 
//             case '^':
//             return 3;
//         }
//         return chr;
//     }

// }
