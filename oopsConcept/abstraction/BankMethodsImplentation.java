import java.util.*;
public class BankMethodsImplementation implements BankMethods{
    Scanner scanner=new Scanner(System.in);
    double ammount=scanner.nextDouble();
    private int pin;
    private double balance;
    public void deposite(){
        this.balance=balance;
        balance=balance+ammount;
        System.out.println(balance);
    }
    public void withdrawl(){
        balance=balance-ammount;
        System.out.println(balance);
    }
     public void checkBalance(){
        this.balance=balance;
        System.out.println(balance);
    }
     public void pinchange(){
        System.out.println("enter old pin");
        this.pin=pin;
       int newPin= scanner.nextInt();
       pin=newPin;
       this.pin=pin;
        System.out.println("Pin changed Successfully");

    }
}
