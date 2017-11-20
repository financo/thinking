package thinking.chapter15;

import java.util.ArrayList;
import java.util.List;

class A{}
class B{}

public class Holder1<T> {
	//在字节码上，T被编译成了Object。如果<T>改为<T extends A>则字节码文件中T被编译成A
	private T t;
	public Holder1(T t){
		this.t = t;
	}
	public void set(T t){
		this.t = t;
	}
	public T get(){
		return t;
	}
	
	public static void main(String[] args) {
		//比较字节码文件，发现A，B字节码层面时一样的，说明编译器解析了泛型，并做了相关操作
		List<A> list = new ArrayList<A>();
		list.add(new A());
		A a = list.get(0);
		
		List list1 = new ArrayList();
		list1.add(new B());
		B b = (B)list1.get(0);
	}
}
