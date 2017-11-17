package thinking.chapter06.nonPublicClassTest.classDefine;

import thinking.chapter06.nonPublicClassTest.classDefine.NonPublicClassTest;
/**
 * 测试非public类在包外的可见性
 * @author Mr.w
 *
 */
public class NonPublicClassTestClient {
	
	public static void main(String[] args) {
		NonPublicClassTest nonPublicClassTest = new NonPublicClassTest();
		//非public类在包内可见
		A a = new A();
	}
}

//非public类在包内可见
class B extends A{}
