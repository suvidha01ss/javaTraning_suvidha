import java.util.*;
class AreaOfCircleMain{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        AreaOfCircle areaOfCircle=new AreaOfCircle();
        System.out.println("enter radius of circle");
        float radius=scanner.nextFloat();

        areaOfCircle.area(radius);

    }
}