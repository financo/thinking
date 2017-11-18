package thinking.chapter10;

public class InitializationOrder {
	public static void main(String[] args) {
//		thinking.chapter10.Son.Inner inner =new Son().new Inner();
//		inner.fi();
		Father father = new Father();
	}
}

class Father {
	int Father_i = f();
//	Inner inner = new Inner();
	int f(){
		System.out.println("Father --> f()");
		return 1;
	}
	Father() {
		System.out.println("Father");
	}
	protected class Inner{
		int j=fi();
		int fi(){
			System.out.println("Father --> Inner --> fi()");
			return 9;
		}
		Inner() {
			System.out.println("Father --> Inner");
		}
	}
}

class Son extends Father{
	int Son_i = f();
	int f(){
		System.out.println("Son --> f()");
		return 1;
	}
	Son() {
		System.out.println("Son");
	}
	public class Inner extends Father.Inner{
		int j=fi();
		int fi(){
			System.out.println("Son --> Inner --> fi()");
			return 9;
		}
		Inner() {
			System.out.println("Son --> Inner");
		}
	}
}