package java2;

import java.util.Scanner;

class Mp3{
	String comp;
	int size;
	public String getComp() {
		return comp;
	}
	public void setComp(String comp) {
		this.comp = comp;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void input() {
		Scanner scan = new Scanner(System.in);
		comp = scan.next();
		size = scan.nextInt();
		setComp(comp);
		setSize(size);
		
	}
	public void show() {
		System.out.println("회사명:"+this.comp);
		System.out.println("메모리 용량: "+this.size);
	}
	
}
public class Test04 {

	public static void main(String[] args) {
		Mp3 mp = new Mp3();
		mp.input();
		mp.show();
	
		
	}

}
