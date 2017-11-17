package thinking.chapter07;

public class Son extends Father {
	public int M(int a){
		System.out.println("Son --> int");
		return 1;
	}
	//子类中不能使用与父类方法签名相同但返回类型不同的方法
//	public void M(int a){
//		System.out.println("Son --> int");
//	}
	
//	public int M(){
//		return 1;
//	}
}
