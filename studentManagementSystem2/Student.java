class Student{
    private int rollNum;
    private String name;
    private long mbNum;

    private Address address;
    private Course course;

    public void setRollNum(int rollNum)
    {
        this.rollNum=rollNum;
    }
    public int getRollNum(){
        return rollNum;
    }


    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;

    }

    public void setMbNum(long mbNum) {
        this.mbNum = mbNum;
    }
    public long getMbNum(){
        return mbNum;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public Address getaddress(){
        return address;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }


    void displayStudent(Address address,Course course){
        this.address=address;
        this.course=course;

        System.out.println(" \tName: "+getName()+"\t Roll number: "+getRollNum()+"\t Mobile No: "+getMbNum());

        System.out.println("Address Details: ");
        address.displayAddress();

        System.out.println("Course details: ");
        course.displayCourse();

    }
}