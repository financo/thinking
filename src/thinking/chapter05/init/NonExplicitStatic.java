package thinking.chapter05.init;
/**
 * 非静态实例初始化
 * @author Mr.w
 *
 */
public class NonExplicitStatic {
	Mug mug1;
	Mug mug2;
	{
		mug1 = new Mug(1);
		mug2 = new Mug(2);
		System.out.println("mug1 & mug2 initialized");
	}

	NonExplicitStatic() {
		System.out.println("Mugs()");
	}

	NonExplicitStatic(int i) {
		System.out.println("Mugs(int)");
	}

	public static void main(String[] args) {
		System.out.println("Inside main()");
		new NonExplicitStatic();
		System.out.println("new Mugs() completed");
		new NonExplicitStatic(1);
		System.out.println("new Mugs(1) completed");
	}
}

class Mug {
	Mug(int marker) {
		System.out.println("Mug(" + marker + ")");
	}

	void f(int marker) {
		System.out.println("f(" + marker + ")");
	}
}
