package thinking.chapter08;
//静态方法没有多态
class StaticSuper {
	public static String staticGet() {
		System.out.println("Base staticGet()");
		return "Base staticGet()";
	}

	public String dynamicGet() {
		staticGet();
		return "Base dynamicGet()";
	}
}

class StaticSub extends StaticSuper {
	public static String staticGet() {
		System.out.println("Derived staticGet()");
		return "Derived staticGet()";
	}

	public String dynamicGet() {
		staticGet();
		return "Derived dynamicGet()";
	}
	

}

public class StaticPolymorohism {
	public static void main(String[] args) {
		StaticSuper sup = new StaticSub(); // Upcast
		sup.dynamicGet();
		System.out.println(sup.staticGet());
		System.out.println(sup.dynamicGet());
	}
}
