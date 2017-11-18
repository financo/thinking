package thinking.chapter10.mycode;

public class Client {
	public static void main(String[] args) {
		new Client().testParcel1();
	}
	
	public void testParcel1(){
		Parcel1 parcel1 = new Parcel1();
		Parcel1.Destination destination= parcel1.new Destination("Shenzhen");
		parcel1.ship("Beijing");
	}
}
