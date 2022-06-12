import java.util.Scanner;

public class AlarmClock {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		if (M < 45) {
			H--;
			M = 60 - (45 - M);
			if (H < 0) {
				H = 23;
			}
			System.out.print(H + " " + M);
		} else {
			System.out.print(H + " " + (M-45));
		}
		
//		king받네..
//		Scanner sc = new Scanner(System.in);
//		int H = sc.nextInt();
//		int M = sc.nextInt();
//		int M1 = M - 45;
//
//		if (M < 45) {
//
//			if (M1 < 0) {
//				M = 60 + M1;
//			} else {
//				M = 60 - (M1);
//			}
//
//			if (H <= 0) {
//				H = 23;
//			}
//		}
//		System.out.print(H + " " + M);

	}

}
