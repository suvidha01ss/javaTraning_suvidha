class Student{
    private int rollNo;
    private String name;
    private String address;

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
    void addStudent(){

        System.out.println("Roll no: "+getRollNo()+" Name: "+getName()+" Address: "+getAddress());
    }
}