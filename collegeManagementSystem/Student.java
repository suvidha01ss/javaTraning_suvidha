class Student
{
    private int rollNum;
    private String studentName;
    private String address;

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    void displayStudent(){
        System.out.println(" Student Name: "+getStudentName()+"Roll Number: "+getRollNum()+"Address: "+getAddress());

    }
}