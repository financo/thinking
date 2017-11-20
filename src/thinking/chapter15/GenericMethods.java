package thinking.chapter15;

public class GenericMethods {
	public <T> void f(T t){
		System.out.println(t.getClass().getName());
	}
	
	public static void main(String[] args) {
		GenericMethods genericMethods = new GenericMethods();
		genericMethods.f("");
		genericMethods.f(1);
		genericMethods.f(1.0);
		genericMethods.f(1.0F);
		genericMethods.f('c');
		genericMethods.f(genericMethods);
	}
}
