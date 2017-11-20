package thinking.chapter15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Fruit{}
class Apple extends Fruit{}
class Jonathan extends Apple{}
class Orange extends Fruit{}

public class CovariantArrays {
	public static void main(String[] args) {
		Fruit[] fruits = new Apple[10];
		fruits[0] = new Apple();
		fruits[1] = new Jonathan();
		try {
			fruits[0] = new Fruit();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			fruits[0] = new Orange();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void f1(){
//		List<Fruit> fruits = new ArrayList<Apple>();
		List<? extends Fruit> fruits = new ArrayList<Apple>();
//		fruits.add(new Apple());
//		fruits.add(new Fruit());
//		fruits.add(new Object());
		fruits.add(null);
		
	}
	
	public void f2(){
		List<? extends Fruit> fruits = Arrays.asList(new Apple());
		Apple a = (Apple)fruits.get(0);
		
		fruits.contains(a);
		fruits.indexOf(a);
	}
}










