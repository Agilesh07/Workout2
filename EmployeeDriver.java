class Employee{

    String Name,result;
    int ass1,ass2,ass3,EmpID;

    Employee(String n, int id)
    {
        Name = n;
        EmpID=id;
    }
//assessment funtion

    void assessment(int a1, int a2, int a3)
    {
        ass1=a1;
        ass2=a2;
        ass3=a3;
        if(ass1>75 && ass2>75 && ass3>75)
        {
            result = "Promoted";
        }
        else result = "Demoted";

    }

//performance function

    void performance()
    {

        System.out.println("The employee: "+Name+" with ID number: "+EmpID+" have been :"+result+" with a total of: "+(ass1+ass2+ass3)+" and percentage of: "+(ass1+ass2+ass3)*100/300);

    }


}


//Driver class
class EmployeeDriver{
    public static void main(String[] args){

        Employee emp1 = new Employee("Conor",123);
        emp1.assessment(78,76,89);
        emp1.performance();


        Employee emp2 = new Employee("John",345);
        emp2.assessment(10,10,80);
        emp2.performance();



    }
}
