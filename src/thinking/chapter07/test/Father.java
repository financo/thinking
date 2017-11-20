package thinking.chapter07.test;

public class Father {
	public void f1(){
		System.out.println("Father --> f1");
		System.out.println(this);
		f2();
		f3();
	}
	
	private void f2(){
		System.out.println("Father --> f2");
		System.out.println(this);
	}
	
	public static void f3(){
		System.out.println("Father --> f3");
	}
}
