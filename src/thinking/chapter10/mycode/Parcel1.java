package thinking.chapter10.mycode;
/**
 * 创建内部类
 * @author Mr.w
 *
 */
public class Parcel1 {
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
	
	public static void main(String[] args) {
		Parcel1 parcel1 = new Parcel1();
		parcel1.ship("Shanghai");
	}
}
