import java.util.Scanner;

//Main class with add method called
public class AddNumbersNoOperator {
	public static void main(String args []) {
		int a;
		int b;
		System.out.println("Enter the two numbers to be added");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		int sum = add(a,b);
		System.out.println("Sum of "+a+" and "+b+" = "+sum);
	}

//the add method calling until b=0 and then retuning the sum
	public static int add(int a, int b) {
		if (b == 0) 
			return a;
		int sum = a ^ b;
		int carry = (a & b) << 1;
		return add(sum,carry);
	}
}