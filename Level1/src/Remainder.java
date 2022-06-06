import java.util.Scanner;

public class Remainder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		String n = "\n";
		System.out.print(((A+B)%C) + n + (((A%C) + (B%C))%C) + n + ((A * B)%C) + n + (((A%C) * (B%C))%C));
	}
}
