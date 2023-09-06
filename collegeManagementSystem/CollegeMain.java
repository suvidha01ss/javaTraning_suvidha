import java.util.Scanner;
class CollegeMain{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        College college=new College();
        Department department=new Department();
        Teacher teacher=new Teacher();
        Student student=new Student();

        department.setDeptName("Compueter Science");
        department.setYear(1);
        department.displayDepartment();

        teacher.setTeacherName("Swati Sharma");
        teacher.setTeacherAddress("Pune");
        teacher.setTeacherId(2);
        teacher.displayTeacher();


        college.displayCollege();



    }

}