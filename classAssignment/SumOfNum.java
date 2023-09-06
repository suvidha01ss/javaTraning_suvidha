import java.util.*;
class SumOfNum
{

    Scanner scanner=new Scanner(System.in);
    int num;

    void sum(){
        System.out.println("I. Find the sum of natural numbers up to a given number.");
        System.out.println("Enter the max number");
        num=scanner.nextInt();
        int add=0;

        for(int i=1;i<=num;i++)
        {
            add=add+i;

        }
        System.out.println("sum of natural numbers between 1 to "+num+" is: "+add);
    }

    public static void main(String[] args) {
        SumOfNum sumOfNum=new SumOfNum();
        sumOfNum.sum();
    }
}