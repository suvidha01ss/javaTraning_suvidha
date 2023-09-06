import java.util.Scanner;
class Square57Demo{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Square57 square57=new Square57();
        System.out.println("Enter Length of square");
        float length=scanner.nextFloat();
        square57.calculateArea(length);

    }

}