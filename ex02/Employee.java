import java.io.*;
public class Employee
{
    String name;
    int age;
    String designation;
    double salary;

    //This is the constructor of the the class Employee
    public Employee(String name)
    {
        this.name = name;
    }

    //Assign the age of the employee to the variablew age.
    public void empAge(int empAge)
    {
        age = empAge;
    }

    //Assign the designation to the variable designationo
    public void empDesignation(String empDesig)
    {
        designation = empDesig;
    }

    //Assign the salary to the variable salary
    public void empSalary(double empSalary)
    {
        salary = empSalary;
    }

    public void printEmployee()
    {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Designation : " + designation);
        System.out.println("Salary : " + salary);
    }
}
