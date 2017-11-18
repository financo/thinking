package thinking.chapter10.mycode;

public class Parcel2 {
	class Content{
		private int i=11;
		public int value(){
			return i;
		}
	}
	
	class Destination{
		private String label;
		public Destination(String label) {
			this.label = label;
		}
		String readLabel(){
			return label;
		}
	}
	
	public void ship(String dest){
		Content c = new Content();
		Destination d = new Destination(dest);
		System.out.println(d.readLabel());
	}
	
	public Destination getDestination(String label) {
		return new Destination(label);
	}
	
	public Content getContent() {
		return new Content();
	}
	
	public static void main(String[] args) {
		Parcel2 parcel2 = new Parcel2();
		parcel2.ship("NewYork");
		Parcel2 parcel22 = new Parcel2();
		Parcel2.Destination d=parcel22.new Destination("washton");
	}
}
