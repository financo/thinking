package thinking.chapter01;
/**
 * 静态私有方法测试。同时使用private， static修饰符时，方法和属性会有怎样的特性
 * @author Mr.w
 *
 */
public class PrivateStaticMethodTest {
	public static void main(String[] args) {
//		WithStaticMethod.a();
		WithStaticMethod.b();
//		int n = WithStaticMethod.i;
		int m = WithStaticMethod.j;
		
//		new WithStaticMethod().a();
		new WithStaticMethod().b(); 
	}
}

class WithStaticMethod{
	private static int i=1;
	public static int j=2;
	
	private static void a(){
		System.out.println("a");
		System.out.println(i);
	}
	
	public static void b(){
		System.out.println("b");
		System.out.println(j);
	}
	
	public static void main(String[] args) {
		a();
		b();
		WithStaticMethod.a();
		WithStaticMethod.b();
	}
}