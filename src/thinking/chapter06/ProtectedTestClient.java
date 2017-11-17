package thinking.chapter06;
/**
 * 同一个包里边可以访问public，protected，default属性，方法
 * @author Mr.w
 *
 */
public class ProtectedTestClient {
	public static void main(String[] args) {
		new ProtectedTest().t1();
	}
}
