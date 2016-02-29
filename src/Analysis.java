import java.util.Scanner;

public class Analysis {

	public static void main(String[] args) {
		
	//create scanner
		Scanner input = new Scanner (System.in);
		
		//initializing variables in declarations
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
		
		//process 10 students using counter controlled loop
		while (studentCounter <= 10)
		{
			//prompt user for input 
			System.out.print("Enter result (1 = pass, 2 = fail) ");
			int result = input.nextInt();
			
			//if...else nested in the while statement
			if (result ==1)
				passes = passes + 1;
			else
				failures = failures +1;
			
			////increment student count so loop eventually ends
			studentCounter = studentCounter + 1;
		}
		
		//termination phase; prepare and displays results
		System.out.printf("Passed: %d%nFai1led: %d%n", passes ,  failures);
		
		//determine whether more than 8 students passed
		if (passes > 8 )
			System.out.println("Bonus to Instructor");
		
		
		
	}

}
