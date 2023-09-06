import java.util.*;
class AreaOfTriangle{
    double area;
    void calculateArea(float side1,float side2,float side3){

        if(side1==side2) {
            if (side1 == side3) {
                System.out.println("Equilateral Triangle with sides: "+side1+" "+side2+" "+side3);
                area=(Math.sqrt(3)/4)*side1*side1;
                System.out.println("Area of above Triangle: "+area);
            }
            else {
                System.out.println("Isoscale Triangle: "+side1+" "+side2+" "+side3);
                area=05*side1*side3;
                System.out.println("Area of above Triangle: "+area);

            }
        }
            else {
            System.out.println("scalene Triangle: "+side1+" "+side2+" "+side3);
            double s;
            s=(side1+side2+side3)/2;
            area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
            System.out.println("Area of above Triangle: "+area);

            }


        }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter three sides of triangle");
        float side1=scanner.nextFloat();
        float side2=scanner.nextFloat();
        float side3=scanner.nextFloat();
        AreaOfTriangle areaOfTriangle=new AreaOfTriangle();
        areaOfTriangle.calculateArea(side1,side2,side3);

    }
}