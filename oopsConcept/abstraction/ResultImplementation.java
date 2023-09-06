import java.util.*;
public class ResultImplementation implements Result{
    private int rollNo;
    private int sub1,sub2,sub3,sub4,sub5;
    private int total;
    private float percentage;
    Scanner scanner=new Scanner(System.in);


    public void setRollNo(int rollNo) {

        System.out.println("Enter roll no");
        this.rollNo = scanner.nextInt();
    }

    public void setSub1(int sub1) {
        this.sub1 = sub1;
    }

    public void setSub2(int sub2) {
        this.sub2 = sub2;
    }

    public void setSub3(int sub3) {
        this.sub3 = sub3;
    }

    public void setSub4(int sub4) {
        this.sub4 = sub4;
    }

    public void setSub5(int sub5) {
        this.sub5 = sub5;
    }

    public void totalMarks(){

        this.total=sub1+sub2+sub3+sub4+sub5;
        total=this.total;
        percentage();
    }
    public void percentage() {
        this.total = total;
        this.percentage = this.total / 5;
        percentage = this.percentage;

    }

    public void print(){
        totalMarks();
        System.out.println("roll no"+rollNo);
        System.out.println("Total Marks :"+total);
        System.out.println("Percentage: "+percentage);


    }




}