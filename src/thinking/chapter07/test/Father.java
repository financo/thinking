package thinking.chapter07.test;

public class Father {
	public void f1(){
		System.out.println("Father --> f1");
		System.out.println(this);
		//父类中的方法调用只会在父类，及父类的超类中找
		f2();
	}
	
	private void f2(){
		System.out.println("Father --> f2");
		System.out.println(this);
	}
}
