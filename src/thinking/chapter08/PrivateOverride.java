package thinking.chapter08;

public class PrivateOverride {
	private void f(){
		System.out.println("private f()");
	}
	public static void main(String[] args) {
		PrivateOverride po = new Derived();
		//此处输出为private f()
		po.f();
	}
}

class Derived extends PrivateOverride{
	public void f(){
		System.out.println("public f()");
	}
}