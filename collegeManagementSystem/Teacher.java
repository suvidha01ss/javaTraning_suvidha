class Teacher{
    private String teacherName;
    private int teacherId;
    private String teacherAddress;

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherAddress() {
        return teacherAddress;
    }

    public void setTeacherAddress(String teacherAddress) {
        this.teacherAddress = teacherAddress;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    void displayTeacher(){

        System.out.println(" Teacher Name: "+getTeacherName()+" Id: "+getTeacherId()
                +" Address: "+getTeacherAddress());
    }
}