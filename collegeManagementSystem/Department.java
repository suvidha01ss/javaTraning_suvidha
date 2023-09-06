class Department{
    private String deptName;
    private int year;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    void displayDepartment(){
        System.out.println("Department Name: "+getDeptName()+"Year: "+getYear());
    }
}