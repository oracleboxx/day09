package java2;
/*add() 메서드 첫번째 ,두번째 매개변수 자료형은 기본타입이어서 값이 전달되고 ,세번째 매개 변수는 
 * 참조타입 이라서 배열주소가 전달이어서 값을 공유할 수 있다
 * 
 */
class Mtobj01 {
	int add(int a, int b) {
		return a+b;
	}
	void add(int a, int b, int[] result) {
		result[0] = a+b;
	}
}
public class java {

	public static void main(String[] args) {
	Mtobj01 m = new Mtobj01();
	 int result = m.add(50,20);
	 System.out.println(result);
	 int[] result1 = {10};
	m.add(50, 30, result1);
	System.out.println(result1[0]);
	
	}

}
