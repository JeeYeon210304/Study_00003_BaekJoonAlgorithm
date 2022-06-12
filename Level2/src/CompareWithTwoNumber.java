import java.util.Scanner;

public class CompareWithTwoNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp0 = sc.nextLine();
		String[] inp1 = inp0.split("\\s");
		int A = Integer.parseInt(inp1[0]);
		int B = Integer.parseInt(inp1[1]);
		if (A > B) {
			System.out.print(">");
		} else if (A < B) {
			System.out.print("<");
		} else if (A == B) {
			System.out.print("==");
		}
	}
}
