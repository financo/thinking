package thinking.chapter10;

public class InnerClassCreate02 {
	class Contents {
		private int i = 11;

		public int value() {
			return i;
		}
	}

	class Destination {
		private String label;

		Destination(String whereTo) {
			label = whereTo;
		}

		String readLabel() {
			return label;
		}
	}

	public Destination to(String s) {
		return new Destination(s);
	}

	public Contents contents() {
		return new Contents();
	}

	public void ship(String dest) {
		Contents c = contents();
		Destination d = to(dest);
		System.out.println(d.readLabel());
	}

	public static void main(String[] args) {
		InnerClassCreate02 p = new InnerClassCreate02();
		p.ship("Tasmania");
		InnerClassCreate02 q = new InnerClassCreate02();
		// Defining references to inner classes:
		InnerClassCreate02.Contents c = q.contents();
		InnerClassCreate02.Destination d = q.to("Borneo");
	}
}
