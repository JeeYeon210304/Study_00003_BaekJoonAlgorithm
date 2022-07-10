import java.util.Scanner;

public class OvenWatch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int inp = sc.nextInt();
		
		int r = h*60 + m + inp;
		h = r/60;
		m = r%60;
		
		if (h > 23) {
			h = h - 24;
		}
		
//		잘되는데ㅡㅡ
//		
//		m = inp + m;
//		
//		for (int i = 1; i <= 24; i ++){
//			
//			if (m >= 60 * i) {
//				m -= 60;
//				h++;
//			}
//
//		}
//		
//		if (m == 60) {
//			m = 0;
//			h++;
//		}
//		
//		if (h > 23){
//			h = 24 - h;
//		}
		
		System.out.print(h + " " + m);
		
		
		
	}
}
