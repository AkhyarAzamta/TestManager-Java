import java.util.Date;
@SuppressWarnings("unused")
public class Employee {
      private static final double BASE_SALARY = 15000.00;
      private String name = "";
      private double Salary = 0.0;
      private Date birthDate;

      public Employee(){
        //no Block
      }
      public Employee(String name, double Salary, Date DoB){
            this.name = name; this.Salary = Salary; this.birthDate = DoB;
      }
      public Employee(String name, double Salary){
            this(name,Salary,null);
      }
      public Employee(String name, Date DoB){
            this(name, BASE_SALARY);
      }
      public Employee(String name){
            this(name, BASE_SALARY);
      }
      public String GetName(){
            return name;
      }
      public double GetSalary(){
            return Salary;
      }
}

class Manager extends Employee{
      private String department;
      public Manager (String name, double Salary, String dept){
            super(name,Salary);
            department = dept;
      }
      public Manager (String n, String dept){
            super(n);
            department = dept;
      }
      public Manager (String dept){
            super();
            department = dept;
      }
      public String GetDept(){
            return department;
      }
}

class TestManager {
      public static void main(String[] args){
            Manager Utama = new Manager("John",5000000,"Financial");
            System.out.println("Name: "+ Utama.GetName());
            System.out.println("Salary: "+ Utama.GetSalary());
            System.out.println("Department: "+ Utama.GetDept());
    
            Utama = new Manager("Michael","Acounting");
            System.out.println("Name: "+ Utama.GetName());
            System.out.println("Salary: "+ Utama.GetSalary());
            System.out.println("Department: "+ Utama.GetDept());
            }
}