package Lab1;

import java.util.Scanner;

public class CSCI428Lab1IyanuAlegbeleye {

	
		/**This program is to compute a basic student registration menu the user 
		 * has to select an option from the options displayed on the screen. 
		 * 'The options are related to adding a student, deleting a student, 
		 * showing the number of students, helping to show the menu options, 
		 * and quitting (exiting) the program. */
		
		
		//print out menu
		private static void printMenu() {
		System.out.println("**********************************************");
		System.out.println("***Automated Registration Menu			   ***");
		System.out.println("***Choose 1 To Add a Student			   ***");
		System.out.println("***Choose 2 To Delete a Student			   ***");
		System.out.println("***Choose 3 To Show the Number of Student  ***");
		System.out.println("***Choose 4 To Exit						   ***");
		System.out.println("***Select one of the operations            ***");
		System.out.println("**********************************************");
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			boolean flag = true;
			int totalStudents = 0;
			
			// Create a scanner class object to get user choice
			Scanner in = new Scanner(System.in);
			
		//get a choice from the user
		
		while(true)
	    {
			printMenu();
			 if (!in.hasNextInt()) {
	                System.out.println("Invalid input. Please enter a number 1-4.\n");
	                in.next(); // consume the bad token
	                continue;
	            }
	          
	    
		  int choice = in.nextInt();
	switch(choice)
	{
	case 1: //Add
		totalStudents++;
		System.out.println("Student added. Total = " + totalStudents);
		break;
	
	case 2: //Delete
		if (totalStudents > 0) 
		{
			totalStudents--;
			System.out.println("Student removed.Total = " + totalStudents);
		}
		else
		{
			System.out.println("No student to remove.Total = " + totalStudents);
		}
		break;
	case 3: // Show total
        System.out.println("Total students = " + totalStudents);
        break;
        
	case 4: //exit
		System.out.println("Goodbye!");
		System.exit(0);
		break;
		
	default:
		System.exit(0);

}
}
	}
}