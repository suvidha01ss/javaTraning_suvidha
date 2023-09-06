import java.util.*;
class StudentMain{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Student student=new Student();
        Address address=new Address();
        Course course=new Course();

        System.out.println("Enter Student Name: ");
        String name=scanner.next();
        student.setName(name);

        System.out.println("Enter Student Roll Number: ");
        int rollNum=scanner.nextInt();
        student.setRollNum(rollNum);

        System.out.println("Enter Student Mobile Number: ");
        long mbNum=scanner.nextLong();
        student.setMbNum(mbNum);

        System.out.println("Enter Address Details ");
        System.out.println("Enter house no: ");
        int houseNum=scanner.nextInt();
       address.setHouseNum(houseNum);


        System.out.println("enter apartment name: ");
        String apartmentName=scanner.next();
        address.setApartmentName(apartmentName);

        System.out.println("enter landmark: ");
        String landmark=scanner.next();
        address.setLandmark(landmark);

        System.out.println("enter tahsil: ");
        String tahsil=scanner.next();
        address.setTahsil(tahsil);

        System.out.println("enter district: ");
        String district=scanner.next();
        address.setDistrict(district);

        System.out.println("enter state: ");
        String state=scanner.next();
        address.setState(state);

        System.out.println("enter pincode: ");
        int pincode=scanner.nextInt();
        address.setPincode(pincode);

        String courseName="Java Full Stack Devloper";
        course.setCoursename(courseName);
        course.setCourseFees(40000);
        course.setCourseDuration(4);

        student.displayStudent(address,course);
    }



}