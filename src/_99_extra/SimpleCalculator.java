package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
		int bb = 0;
while(bb == 0) {
		// 1. Get 2 numbers from the user and convert them to integer.
String n = JOptionPane.showInputDialog("Give me a number.");
Integer.parseInt(n);
int m = Integer.parseInt(n);
String nn = JOptionPane.showInputDialog("Give me a number.");
Integer.parseInt(nn);
int mm = Integer.parseInt(nn);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int o = JOptionPane.showOptionDialog(null, "Select operation", "M-bot", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
				null);
if(o == 0) {
	add(m,mm);
}
else if(o == 1) {
	subtract(m,mm);
}
else if(o == 0) {
	multiply(m,mm);
}
else{
	divide(m,mm);
}		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
int q = JOptionPane.showOptionDialog(null, "Would you like to exit?", "M-bot", 0,
		JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Yes", "No" },
		null);
if(q == 0) {
bb = 1;	
}
}
		
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
static void add(int num1, int num2) {
int	num = num1 + num2;
JOptionPane.showMessageDialog(null, num);
}
static void subtract(int num1, int num2) {
int	num = num1 - num2;
JOptionPane.showMessageDialog(null, num);
}
static void multiply(int num1, int num2) {
int	num = num1*num2;
JOptionPane.showMessageDialog(null, num);
}
static void divide(int num1, int num2) {
int	num = num1/num2;
JOptionPane.showMessageDialog(null, num);
}
	// 4. Create similar methods for subtraction, multiplication and division.
}