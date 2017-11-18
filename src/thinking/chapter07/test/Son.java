package thinking.chapter07.test;

public class Son extends Father {
	
	public void f2(){
		System.out.println("Son --> f2");
		System.out.println(this);
	}
	public static void main(String[] args) {
		new Son().f1();
	}
}
