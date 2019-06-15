import javax.swing.JOptionPane;

public class SalaryProcessor {

	public static void main(String[] args) {
		int numSalaries = Integer.parseInt(JOptionPane.showInputDialog("How many salaries?")); // Step 1: Ask the user
																								// how many salaries
																								// they would like to
																								// process

		while (numSalaries <= 0) { // Making sure that the first input is valid with this loop
			numSalaries = Integer.parseInt(JOptionPane.showInputDialog("Error! Enter a positive number!"));
		}

		double total = 0.0; // Step 2: Create a running total and initialise it to zero
		double salary;
		int counter = 0; // Step 3: Create a counter that we can use to keep track of how many salaries
							// we have processed so far and set it to zero at first.
		while (counter < numSalaries) { // Step 4: this is the main loop, doing the addition of the entered values
			salary = Double.parseDouble(JOptionPane.showInputDialog("Enter salary " + counter));// Step 4.1: Ask user to
																								// enter a salary
			while (salary <= 0) { // Validation loop, making sure both salary values are correct
				salary = Integer.parseInt(JOptionPane.showInputDialog("Error! Enter a positive number!"));
			}

			total = total + salary;// Step 4.2:Add the entered salary to the running total
			counter = counter + 1;// Step 4.3: Increment the counter by 1
		} // Step 4.4: Repeat from top of step 4
		JOptionPane.showMessageDialog(null, "Total is: " + total);// Step 5: Display the total
	}

}

//For Loop: When you know the exact number of times you want to loop through your code.
//	e.g 
//	for (x1; x2; x3;) { 
//		CODE 
//	}
// x1 will be performed 1 time before the CODE is executed
// x2 defines the condition for execution
// x3 is executed every time after the code has been executed

// Working example to count to 5 (including 0):
//		for (int a = 0; a < 6; a++) {
//			System.out.println(a);
//		}



//Do/While Loop: It will execute the code once, BEFORE checking if the condition is true. It will then repeat the loop as long as the condition is true.
// 	e.g
// 		do {
//		 	CODE
//		} while (condition);

//Working example to count to 5 (including 0):
//		int a = 0;
//		do {
//			System.out.println(a);
//			a++;
//		} while (a < 6);