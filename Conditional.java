import java.util.*;
class Conditional {
    //how to use scanner class
    /*Scanner scanner=new Scanner(System.in);
    System.out.println("Enter marks of five subjects");
    int sub1=scanner.nextInt();
    int sub2=scanner.nextInt();
    int sub3=scanner.nextInt();
    int sub4=scanner.nextInt();
    int sub5=scanner.nextInt();

     */
    int sub1, sub2, sub3, sub4, sub5;
    int total;
    float percentage;

    void totalMarks(int sub1, int sub2, int sub3, int sub4, int sub5) {
        total = sub1 + sub2 + sub3 + sub4 + sub5;

        System.out.println("total marks=" + total);
        System.out.println(" sub1:" + sub1 + "  sub2:" + sub2 + "  sub3:" + sub3 + "  sub4:" + sub4 + "  sub5:" + sub5);
        calculatePercentage(sub1, sub2, sub3, sub4, sub5);
    }

    void calculatePercentage(int sub1, int sub2, int sub3, int sub4, int sub5) {
        if (sub1 >= 35 && sub2 >= 35 && sub3 >= 35 && sub4 >= 35 && sub5 >= 35) {
            percentage = total / 5;

            if (percentage >= 75) {
                System.out.println("Congratulation!..you are pass with distinction with percentage: " + percentage);
            } else if (percentage > 60 && percentage < 75) {
                System.out.println("Congratulation!.you are pass with first division: " + percentage);
            } else if (percentage > 50 && percentage < 60) {
                System.out.println("Congratulation!..you are pass with second division: " + percentage);
            } else if (percentage > 35 && percentage < 50) {
                System.out.println("Congratulation!..you are pass with third division: " + percentage);
            }
        }else {
                System.out.println("You are Failed" + percentage);
            }

        }

}



