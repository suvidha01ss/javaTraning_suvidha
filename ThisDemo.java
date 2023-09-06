class ThisDemo{
    int rollNo;
    String firstName;
    String lastname;
    int marks;

    void print(int rollNo,String firstName,String lastname,int marks)
    {
        System.out.println(rollNo+": has first name "+firstName+"  has last name: "+lastname+" marks is: "+marks);
    }

    void updateMarks(int marks){
       this.marks=marks+20;
        System.out.println("Updated marks: "+marks);
    }

}
