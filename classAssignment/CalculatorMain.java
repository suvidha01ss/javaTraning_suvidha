import java.util.*;
class CalculatorMain{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Calculator calculator=new Calculator();

        System.out.println("enter two numbers");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();

        calculator.setNum1(num1);
        calculator.setNum2(num2);

        int ch;
        System.out.println("Enter 1: Addition,2:Substaction,3:Multiplication,4:Division");
        ch=scanner.nextInt();
        switch (ch)
        {
            case 1:calculator.addition();
            break;

            case 2:calculator.substraction();
            break;

            case 3:calculator.multiplication();
            break;

            case 4:calculator.division();
            break;

            default:
                System.out.println("invalid choice ");
        }

    }

}