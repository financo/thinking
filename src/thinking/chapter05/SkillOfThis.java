package thinking.chapter05;
/**
 * 在方法中通过this获取方法的调用者，并对调用者进行处理
 * @author Mr.w
 *
 */
public class SkillOfThis {
	public static void main(String[] args) {
		new Person().eat(new Apple());
	}
}

class Peeler{
	static Apple peel(Apple apple){
		System.out.println("已经削皮。。。");
		return apple;
	}
}

class Apple{
	Apple getPeeled(){return Peeler.peel(this);}
}

class Person{
	public void eat(Apple apple){
		//调用方法处理自己
		apple.getPeeled();
		System.out.println("yeah!");
	}
}