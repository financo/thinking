package thinking.chapter07;
/**
 * 初始化顺序
 * 基类静态初始化 --> 导出类静态初始化 --> 基类非静态初始化 --> 基类构造器 -->
 * 导出类非静态初始化 --> 导出类构造器
 * @author Mr.w
 *
 */
public class ExtendsInitializeTest extends Insect {
	private int k = printInit("Beetle.k initialized");

	public ExtendsInitializeTest() {
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}

	private static int x2 = printInit("static Beetle.x2 initialized");

	public static void main(String[] args) {
		System.out.println("Beetle constructor");
		ExtendsInitializeTest b = new ExtendsInitializeTest();
	}
}

class Insect {
	private int i = 9;
	protected int j;

	Insect() {
		System.out.println("i = " + i + ", j = " + j);
		j = 39;
	}

	private static int x1 = printInit("static Insect.x1 initialized");

	static int printInit(String s) {
		System.out.println(s);
		return 47;
	}
}