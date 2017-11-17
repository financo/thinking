package thinking.chapter07;
/**
 * 测试继承中的方法重写
 * @author Mr.w
 *
 */
public class Father {
	public void M(){
		System.out.println("Father --> void");
	}
	
	public int M(int a){
		System.out.println("Father --> int");
		return 1;
	}
}
