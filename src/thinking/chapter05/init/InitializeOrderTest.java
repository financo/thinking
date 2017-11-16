package thinking.chapter05.init;
/**
 * 测试初始化顺序
 * 结论：成员变量的初始化先于构造函数执行
 * @author Mr.w
 *
 */
public class InitializeOrderTest {
	int i = f1();
	int j = f2(i);
	int f1(){
		System.out.println("f1");
		return 1;
	}
	int f2(int m){
		System.out.println("f2");
		return 2*m;
	}
	InitializeOrderTest(){
		System.out.println("InitializeOrderTest");
	}
	public static void main(String[] args) {
		new InitializeOrderTest();
	}
}
