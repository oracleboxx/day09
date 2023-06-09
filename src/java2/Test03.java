package java2;

class Test {
	public void p(int a , int b) {
		System.out.println("a와 b중에서 최대 값 : "+Math.max(a, b));
	}
	public void p(double a, double b) {
		System.out.println("a와 b중에서 최대 값 : "+Math.max(a, b));
	}
}
public class Test03 {

	public static void main(String[] args) {
		Test t = new Test();
		t.p(30, 40);
		t.p(3.14, 5.14);
	}

}
