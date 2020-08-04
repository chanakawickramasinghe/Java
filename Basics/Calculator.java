import java.util.Scanner; //importing scanner

public class Calculator { //class Calculator
	public static void main(String [] args) { //main method
		double first, second, ans;
		char op;
		Scanner read = new Scanner(System.in);
		
		//input number 1
		System.out.print("Enter Fisrt Number : ");
		first = read.nextDouble();
		
		//input number 2
		System.out.print("Enter Second Number : ");
		second = read.nextDouble();
		
		//input operator
		System.out.print("Enter an Operator (+,-,*,/) : ");
		op = read.next().charAt(0);
		
		switch (op) //switch case to select the operation
		{
			case '+':
				ans = first + second; //add
				break;
			
			case '-':
				ans = first - second; //sub
				break;
				
			case '*':
				ans = first * second; //mul
				break;
				
			case '/':
				ans = first / second; //div
				break;
				
			default:
				System.out.print("Incorrect Operator"); //if wrong operator is entered
				return;
				
		}
		System.out.print(first+" "+op+" "+second+" = "+ans); //print statement
	}
}
