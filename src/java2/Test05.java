package java2;
/*생성자의 주된 특징
 * 1. 생정자는 클래스명과 같다.
 * 2. 생성자는 클래스의 구성요소이고, new 클래스명();에 의해서 호출된다.
 * 3. 
 * 
 */
class MyDate03{
	private int year = 2023;
	private int month =6;
	private int date =10;
	

public MyDate03() {
	System.out.println("기본 생성자 호출");
}
	public void print() {
		System.out.println(year+"년"+month+"월"+date+"일");
	}
}
public class Test05 {

	public static void main(String[] args) {
		new MyDate03();
		new MyDate03().print();;
	}

}
