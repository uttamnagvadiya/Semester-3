import java.io.*;
import java.util.*;

class EvalutionOfPrefixExp {

	static Boolean isOperand(char c)
	{	
		if (c >= 48 && c <= 57)										//	alt 48 = 0   &   alt 57 = 9;
			return true;
		else
			return false;
	}

	static double evaluatePrefix(String exprsn)
	{
		Stack <Double> Stack = new Stack <Double> ();

		for (int j = exprsn.length() - 1; j >= 0; j--) {

			if (isOperand(exprsn.charAt(j)))
				Stack.push((double)(exprsn.charAt(j) - '0'));

			else {
				double oprand_1 = Stack.peek();
				Stack.pop();
				double oprand_2 = Stack.peek();
				Stack.pop();

			
				switch (exprsn.charAt(j)) {
				case '+':
					Stack.push(oprand_1 + oprand_2);
					break;
				case '-':
					Stack.push(oprand_1 - oprand_2);
					break;
				case '*':
					Stack.push(oprand_1 * oprand_2);
					break;
				case '/':
					Stack.push(oprand_1 / oprand_2);
					break;
				}
			}
		}

		return Stack.peek();
	}

	
	public static void main(String[] args)
	{
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the Prefix Expression : ");
		System.out.println(evaluatePrefix(sc.next()));
	}
}
