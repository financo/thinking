package thinking.chapter07.test;

public class Son extends Father {
	
	public void f2(){
		System.out.println("Son --> f2");
		f3();
		System.out.println(this);
	}
	public static void f3(){
		System.out.println("Son --> f3");
	}
	public static void main(String[] args) {
		new Son().f1();
	}
}
