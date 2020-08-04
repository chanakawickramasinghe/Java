import java.util.Scanner; //importing the scanner for java

public class SimpleCalculator { //class named SimpleCalculator
	public static void main (String args[]){ //main method
		
		Scanner readinput = new Scanner(System.in); //creating an object for the scanner
		
		System.out.print("Enter First number (A): "); //print statement
		int A = readinput.nextInt(); //input integer
		
		System.out.print("Enter First number (B): "); //print statement
		int B = readinput.nextInt(); //input integer
		
		int add = A+B; //calculating addition
		int sub = A-B; //calculating subraction
		int mul = A*B; //calculating multiplication
		float div = (float)A/(float)B; //calculating division
		
		//print statements for the results
		System.out.println("A+B = "+add);
		System.out.println("A-B = "+sub);
		System.out.println("A*B = "+mul);
		System.out.println("A/B = "+div);
	}
}