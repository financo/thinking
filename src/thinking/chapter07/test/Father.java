package thinking.chapter07.test;

public class Father {
	public void f1(){
		System.out.println("Father --> f1");
		System.out.println(this);
		f2();
	}
	
	/*public*/private void f2(){
		System.out.println("Father --> f2");
		System.out.println(this);
	}
}
