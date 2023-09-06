class Student{
    static String collegeName;
    static{
     collegeName="Government College";
    }
    private int rollNo;
    private String name;
    private String address;
    Course course;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void display(Course course){
        System.out.println(" "+collegeName+" \n Roll No: "+rollNo+" "+" \n Name:  "+name+"\n Address: "+address+" ");

        System.out.println(" Marks: "+course.getMarks()+"\n Course Name: "+course.getCourseName());

    }
}