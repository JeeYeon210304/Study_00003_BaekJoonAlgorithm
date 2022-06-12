import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		if (in % 4 == 0 && in % 100 != 0 || in % 400 == 0) {
			System.out.print(1);
		} else {
			System.out.print(0);
		} 
	}
}
