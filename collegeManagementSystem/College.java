class College {
    static{
        String collegeName ="Government Engineering College";
    }
    private Department department;
    private Teacher teacher;
    private Student student;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    void displayCollege(){
        System.out.println("Department Information: "+getDepartment()+"\n Teacher Inormation: "+getTeacher()
                +"\n Student Information"+getStudent());
    }

}