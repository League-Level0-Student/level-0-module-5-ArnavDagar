package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Prime {
	public static void main(String [] arg) {
		String x;
		x = JOptionPane.showInputDialog("Pick a number.");
		int num;
		String answer;
		num = Integer.parseInt(x);
		for (int i = 2; i < Math.sqrt(i); i++) {
			if (num%i == 0) {
				answer = "Not prime";
			}
		}
	}
}
