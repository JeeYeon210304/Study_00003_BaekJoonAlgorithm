import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		String n = "\n";
		System.out.print((A*(B%10)) + n + (A*((B%100)/10)) + n + (A*(B/100)) + n + A*B);
	}
}

