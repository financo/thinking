package thinking.chapter13;
/**
 * 把String对象当作方法参数时，都会复制一份引用。可以理解为时值传递
 * @author Mr.w
 *
 */
public class Immutable {
  public static String upcase(String s) {
    return s.toUpperCase();
  }
  public static void main(String[] args) {
    String q = "howdy";
    System.out.println(q); 
    String qq = upcase(q);
    System.out.println(qq); 
    System.out.println(q); 
  }
}
