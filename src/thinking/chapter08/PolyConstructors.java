package thinking.chapter08;
/**
 * 初始化顺序：
 * 1.将分配给对象的空间初始化成二进制的0
 * 2.掉用基类构造器
 * 3.按照声明顺序调用成员初始化方法
 * 4.调用构造器主体
 * @author Mr.w
 *
 */
class Glyph {
	void draw() {
		System.out.println("Glyph.draw()");
	}

	Glyph() {
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;

	RoundGlyph(int r) {
		radius = r;
		System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
	}

	void draw() {
		System.out.println("RoundGlyph.draw(), radius = " + radius);
	}
}

public class PolyConstructors {
	public static void main(String[] args) {
		new RoundGlyph(5);
	}
}
