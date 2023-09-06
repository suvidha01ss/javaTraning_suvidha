import java.util.*;
class StudentMain{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Student student=new Student();
        Course course=new Course();

        System.out.println("Enter name of student");
        String name= scanner.next();
        student.setName(name);
        student.getName();

        System.out.println("Enter roll No of student");
        int rollNo=scanner.nextInt();
        student.setRollNo(rollNo);
        student.getRollNo();



        System.out.println("Enter Address of student");
        String address=scanner.next();
        student.setAddress(address);
       // student.setAddress(scanner.next());
        student.getAddress();

        System.out.println("Enter Marks of student");
        int marks=scanner.nextInt();
        course.setMarks(marks);
        course.getMarks();

        System.out.println("Enter course name of student");
        String courseName=scanner.next();
        course.setCourseName(courseName);
        course.getCourseName();

        student.display(course);

    }
}