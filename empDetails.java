/*2.	Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.

Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same*/
class member
  {
    String name;
    int age;
    String Phone_number;
    String address;
    int salary;
  

    public void printsalary()
    {
      System.out.println(salary);
    }
  }

    class Employee extends member
      {
        String specialization;
      }

    class Manager extends member
      {
        String department;
      }
  
class empDetails
  {
    public static void main(String ar[])
    {
      Employee emply= new Employee();
      emply.name="Chandu";
      emply.age=24;
      emply.Phone_number="9398099969";
      emply.address= "Ongole, Andhra pradesh";
      emply.salary= 500000;
      emply.specialization="Engineering works";

      emply.printsalary();

      Manager mangr= new Manager();
      mangr.name="Dheeraj";
      mangr.age=24;
      mangr.Phone_number="9398099967";
      mangr.address= "Ongole-1, Andhra pradesh";
      mangr.salary= 1000000;
      mangr.department="Business operations";

      mangr.printsalary();
      
    }

    
  }