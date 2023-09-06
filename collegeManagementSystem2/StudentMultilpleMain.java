class StudentMultipleMain{
    public static void main(String[] args) {



        StudentMultiple[] arry = new StudentMultiple[2];
        StudentMultiple studentMultiple = new StudentMultiple();
        StudentMultiple studentMultiple1 = new StudentMultiple();


        studentMultiple.setStudentName("suvidha");
        studentMultiple.setAddress("pune");


        studentMultiple1.setStudentName("priya");
        studentMultiple1.setAddress("mumbai");


        arry[0] = studentMultiple;
        arry[1] = studentMultiple1;
        for (int i = 0; i < arry.length; i++) {
            arry[i].displayStudentMultiple();
        }
        TeacherMultiple1[] arr2 = new TeacherMultiple1[2];
        TeacherMultiple1 teacher = new TeacherMultiple1();
       TeacherMultiple1 teacher1=new TeacherMultiple1();

        arr2[0] = teacher;
        arr2[1] = teacher1;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i].displayTeacher();
        }


    }


}