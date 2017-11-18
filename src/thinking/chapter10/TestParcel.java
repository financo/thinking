package thinking.chapter10;

import thinking.chapter10.interfac.Contents;
import thinking.chapter10.interfac.Destination;
/**
 * 内部类私有化，外部不能直接创建内部类对象，也不能向下转型成内部类
 * @author Mr.w
 *
 */
class Parcel4 {
	private class PContents implements Contents {
		private int i = 11;

		public int value() {
			return i;
		}
	}

	protected class PDestination implements Destination {
		private String label;

		private PDestination(String whereTo) {
			label = whereTo;
		}

		public String readLabel() {
			return label;
		}
	}

	public Destination destination(String s) {
		return new PDestination(s);
	}

	public Contents contents() {
		return new PContents();
	}
}

public class TestParcel {
	public static void main(String[] args) {
		Parcel4 p = new Parcel4();
		Contents c = p.contents();
		Destination d = p.destination("Tasmania");
		// 内部类修饰词为private protected，客户端不能直接创建对象，甚至不能向下转型
		// ! Parcel4.PContents pc = p.new PContents();
	}
} // /:~
