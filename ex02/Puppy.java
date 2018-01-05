public class Puppy
{
  int puppyAge;
  public Puppy()
  {

  }

  public void setAge(int age)
  {
    puppyAge = age;
  }

  public int getAge()
  {
    System.out.println("Puppy's age is " + puppyAge);
    return puppyAge;
  }


  public Puppy(String name)
  {
    System.out.println("Passed name is : " + name);
  }

  public static void main(String[] args) {
    Puppy myPuppy = new Puppy("tommy");
    System.out.println("Variable value :" + myPuppy.getAge());
    System.out.println("Variable value :" + myPuppy.puppyAge);
    myPuppy.setAge( 2 );
    System.out.println("Variable value :" + myPuppy.getAge());
    System.out.println("Variable value :" + myPuppy.puppyAge);
  }
}
