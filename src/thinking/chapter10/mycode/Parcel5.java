package thinking.chapter10.mycode;

import thinking.chapter10.interfac.Destination;

public class Parcel5 {
	public Destination destination(String s){
		class PDestination implements thinking.chapter10.interfac.Destination{
			private String label;
			
			public PDestination(String to) {
				this.label = to;
			}
			@Override
			public String readLabel() {
				return label;
			}
			
		}
		return new PDestination(s);
	}
	
	class PDestination {
	}
	
	public static void main(String[] args) {
		Parcel5 parcel5 = new Parcel5();
		Destination destination = parcel5.destination("london");
		System.out.println(destination.readLabel());
	}
}
