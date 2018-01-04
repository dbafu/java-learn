public class Jic
{
  public static void main(String[] args) {
    B b = new B();
    b.t();
  }
}

class A
{
  private int a = 3;
}
class B extends A
{
  private int b = 5;
  private int c = super.a;
  public  void t(){
    System.out.println(c);
  }
}
