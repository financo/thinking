package thinking.chapter10;
/**
 * 从其他对象中直接创建内部类对象
 * @author Mr.w
 *
 */
public class DotNew {
  public class Inner {}
  public static void main(String[] args) {
    DotNew dn = new DotNew();
    DotNew.Inner dni = dn.new Inner();
  }
} ///:~
