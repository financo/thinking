package thinking.chapter10.mycode;

public class Parcel8 {
	public Wrapping wrapping(final int i) {
		return new Wrapping(i){
			public int value(){
				return i*12;
			}
		};
	}
	public static void main(String[] args) {
		Parcel8 parcel8 = new Parcel8();
		Wrapping wrapping = parcel8.wrapping(10);
		System.out.println(wrapping.value());
	}
}
