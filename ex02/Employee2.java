import java.io.*;

public class Employee2
{
    // salary variable is a private static variable
    private  static double salary;

    // DEPARMENT is a constant
    public static final String DEPARMENT = "Development";

    public static void main(String[] args) {
        salary = 1000.0;
        System.out.println(DEPARMENT + "average salary:" + salary);
    }
}
