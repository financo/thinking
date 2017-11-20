package thinking.chapter15;

public class Holder<T> {
	private T value;
	public Holder(){}
	public Holder(T t){this.value = t;}
	public void set(T val){
		this.value = val;
	}
	public T get(){
		return value;
	}
	public boolean equals(Object object){
		return value.equals(object);
	}
	
	public static void main(String[] args) {
		Holder<Apple> holder = new Holder<Apple>(new Apple());
		Apple d = holder.get();
		holder.set(d);
		
		Holder<? extends Fruit> holder2 = holder;
		
	}
}
