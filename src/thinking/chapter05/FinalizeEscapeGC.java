package thinking.chapter05;
/**
 * 测试周志明，深入Java原理一书第66页代码
 * @author Mr.w
 *
 */
public class FinalizeEscapeGC {
	int[][] a= new int[10240][1024];
	
	public static FinalizeEscapeGC SAVE_HOOK = null;
	
	public void isAlive(){
		System.out.println("still alive!");
	}
	
	protected void finalize() throws Throwable{
		super.finalize();
		System.out.println("finalize method executed!");
		//无论此处调用不调用FinalizeEscapeGC.SAVE_HOOK=this，在第一次垃圾回收的时候，
		//main方法中的FinalizeEscapeGC对象都不会被垃圾回收，深入Java虚拟机一书第66页的说法有误
		//正确的说法在thinking 87页
//		FinalizeEscapeGC.SAVE_HOOK = this;
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(60000);
		System.out.println("start!!!!!!!");
		SAVE_HOOK = new FinalizeEscapeGC();
		SAVE_HOOK = null;
		System.gc();
		Thread.sleep(30000);
		if (SAVE_HOOK != null) {
			SAVE_HOOK.isAlive();
		}else {
			System.out.println("dead!");
		}
		
		SAVE_HOOK = null;
		System.gc();
		Thread.sleep(30000);
		if (SAVE_HOOK != null) {
			SAVE_HOOK.isAlive();
		}else {
			System.out.println("dead!");
		}
	}
}
