
public class We_love_kriii {
	public static void main (String[] args) {
		String a = "강한친구 대한육군";
		We_love_kriii We_love_kriii = new We_love_kriii(); 
		We_love_kriii.prinTwice(a);
		We_love_kriii.prinTwice(a);
	}
	// 걍 논스테틱 메소드 쓰는 거 꼬아서 만들어 봄
	public void prinTwice(String b) {
		System.out.println(b);
	}
}
