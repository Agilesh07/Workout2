import java.util.Scanner;

class MathOperation{

    int X,Y;
    double R;

//input method

    void init(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers to do the operations: ");
        X=input.nextInt();
        Y=input.nextInt();
    }

//add method

    void add(){
        R=X+Y;
    }

//multiply method

    void multiply(){
        R=X*Y;
    }

//power method

    void power(){

        R=Math.pow(X,Y);

    }

//display

    void display(){
        add();
        System.out.println("The sum is: "+R);
        multiply();
        System.out.println("The product is: "+R);
        power();
        System.out.println("The power is: "+R);
    }

}


class MathOperationDriver{
    public static void main(String[] args){

        MathOperation m1= new MathOperation();

        m1.init();
        m1.display();



    }
}
