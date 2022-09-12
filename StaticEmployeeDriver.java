class StaticEmployeeDriver{}
class Employee{

    static int totalSalary=0;
    static int empNo=0;
    int salary;

    Employee(int s)
    {
        salary= s;
        totalSalary+=salary;
        empNo++;

    }

    //making function static so it can be called without object.
    static void display()
    {

        System.out.println("There is a total of "+empNo+" employees and their total of salaries are: "+totalSalary);


    }

}


class staticEmployeeDriver{
    public static void main(String[] args){

        Employee emp1= new Employee(5000);

        Employee emp2= new Employee(4000);

        Employee emp3= new Employee(1000);

        Employee emp4= new Employee(7000);

        Employee empx= new Employee(3000);

        Employee.display();  //calling static function with classname.functionname()



    }
}
