package thinking.chapter10;
/**
 * 内部类获取外部对象的引用
 * @author Mr.w
 *
 */
public class DotThis {
	void f() {
		System.out.println("DotThis.f()");
	}

	public class Inner {
		public DotThis outer() {
			return DotThis.this;
			// A plain "this" would be Inner's "this"
		}
	}

	public Inner inner() {
		return new Inner();
	}

	public static void main(String[] args) {
		DotThis dt = new DotThis();
		DotThis.Inner dti = dt.inner();
		dti.outer().f();
	}
} /*
 * Output: DotThis.f()
 */// :~
