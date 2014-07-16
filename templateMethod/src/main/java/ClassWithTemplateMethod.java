/**
 * User: y.zakharov
 * Date: 16.07.14
 */
public abstract class ClassWithTemplateMethod {
  public abstract void method1();
  public abstract void method2();
  public abstract void method3();
  public void templateMethod(){
    method1();
    method2();
    method3();
  }
}
