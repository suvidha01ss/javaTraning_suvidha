import java.util.*;
class EvenOdd{

    void check(int num){
        if(num%2==0){
            System.out.println(num+" :Even Number");
        }
        else {
            System.out.println(num+" :Odd Number");
        }
    }
    public static void main(String args[]){
        EvenOdd evenOdd=new EvenOdd();
        Scanner scanner=new Scanner(System.in);
        int num;
        System.out.println("Progrm to check number is Even or Odd");
        System.out.println("Enter the number");
        num=scanner.nextInt();
        evenOdd.check(num);
    }
}