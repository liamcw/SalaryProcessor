import javax.swing.JOptionPane;

public class SalaryProcessor {

	public static void main(String[] args) {
		int numSalaries = Integer.parseInt(JOptionPane.showInputDialog("How many salaries?")); // Step 1: Ask the user
																								// how many salaries
																								// they would like to
																								// process
		
		while (numSalaries <= 0) { // As long as the age is not 0 or less than 0
			numSalaries = Integer.parseInt(JOptionPane.showInputDialog("Error! Enter a positive number!"));
		}
			
		double total = 0.0; // Step 2: Create a running total and initialise it to zero
		double salary;
		int counter = 0; // Step 3: Create a counter that we can use to keep track of how many salaries
							// we have processed so far and set it to zero at first.
		while (counter < numSalaries) { // Step 4
			salary = Double.parseDouble(JOptionPane.showInputDialog("Enter salary " + counter));//Step 4.1: Ask user to enter a salary
			total = total + salary;// Step 4.2:Add the entered salary to the running total
			counter = counter + 1;// Step 4.3: Increment the counter by 1
		} // Step 4.4: Repeat from top of step 4
		JOptionPane.showMessageDialog(null, "Total is: " + total);// Step 5: Display the total
	}

}
