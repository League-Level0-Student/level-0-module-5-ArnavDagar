package _01_algorithms._2_fibonacci;

import javax.swing.JOptionPane;

public class Fibonacci {
	public static void main(String [] arg) {
		int num1;
		int num2;
		int sum;
		num1 = 1;
		num2 = 1;
		sum = 2;
		for (int i = 1; i < 12; i++) {
			JOptionPane.showMessageDialog(null, sum);
			num1 = num2;
			num2 = sum;
			sum = num1 +num2;
		}
	}
}
