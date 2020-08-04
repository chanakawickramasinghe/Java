import java.util.Random; //random number generate package

public class random{
	public static void main(String [] args){
		
		for(int i=0;i<5;i++){ //loop to run 5 times
			Random r = new Random(); 
			int upper = 100; //upper boundry
			
			int num = r.nextInt(upper); //creating random numbers
			
			if(num>50){ //if statement for numbers above 50
				System.out.println(num+" : "+ "High"); 
			}
			else{ //else statement for number <= 50
				System.out.println(num+" : "+ "Low");
			}
		}
	}
}