class Student{
    String name,address;
    int rollNo;
    long mobileNo;

  //  static int mark=82;
  //  System.out.println("hello marks"+mark);


    void getName()
    {

        System.out.println("Name of Student: "+name);
    }

    void getAddress(String address)
    {
        System.out.println("Address of Student: "+address);
    }

    int getRollNo(int rollNo)
    {

        rollNo=rollNo;
        System.out.println("Roll No is: "+rollNo);
        return rollNo;
    }

    void getMobileNo(long mobileNo)
    {
        System.out.println("Mobile Number is: "+mobileNo);
    }

}