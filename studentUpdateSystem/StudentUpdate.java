   import java.util.*;
   class StudentUpdate{
      Student student=new Student();
      Student[] arr=new Student[3];
      Scanner scanner = new Scanner(System.in);


      void addStudent(){

         Student student1 = new Student();
         Student student2 = new Student();
         Student student3 = new Student();

         System.out.println("Enter Roll Numbers of three Student ");
         int rollNo1 = scanner.nextInt();
         int rollNo2 = scanner.nextInt();
         int rollNo3 = scanner.nextInt();

         student1.setRollNo(rollNo1);
         student2.setRollNo(rollNo2);
         student3.setRollNo(rollNo3);

         System.out.println("Enter Name of three Student ");
         String name1 = scanner.next();
         String name2= scanner.next();
         String name3 = scanner.next();
         student1.setName(name1);
         student2.setName(name2);
         student3.setName(name3);

         System.out.println("Enter Address of three Student ");
         String address1= scanner.next();
         String address2= scanner.next();
         String address3= scanner.next();

         student1.setAddress(address1);
         student2.setAddress(address2);
         student3.setAddress(address3);
         arr[0] = student1;
         arr[1] = student2;
         arr[2] = student3;
         System.out.println("Student Information: ");
         for (int i = 0; i < arr.length; i++) {
            arr[i].addStudent();
         }
      }

      void updateStudent() {

         int ch1;
         System.out.println("Enter roll no between 1 to 3");
         ch1 = scanner.nextInt();
         switch (ch1) {
            case 1:
               System.out.println("Enter new roll number");
               int rollNo1 = scanner.nextInt();
               student.setRollNo(rollNo1);

               System.out.println("Enter new student name");
               String name1 = scanner.next();
               student.setName(name1);

               System.out.println("Enter new student address");
               String address1 = scanner.next();
               student.setAddress(address1);

               arr[0] = student;
               System.out.println("New Student Record Updated");

               for (int i = 0; i < arr.length; i++) {
                  arr[i].addStudent();
               }


            break;

            case 2:

               System.out.println("Enter new roll number");
               int rollNo2 = scanner.nextInt();
               student.setRollNo(rollNo2);

               System.out.println("Enter new student name");
               String name2 = scanner.next();
               student.setName(name2);

               System.out.println("Enter new student address");
               String address2 = scanner.next();
               student.setAddress(address2);
               arr[1] = student;
               System.out.println("New Student Record Updated");
               for (int i = 0; i < arr.length; i++) {
                  arr[i].addStudent();
               }


            break;

            case 3:

               System.out.println("Enter new roll number");
               int rollNo3 = scanner.nextInt();
               student.setRollNo(rollNo3);

               System.out.println("Enter new student name");
               String name3 = scanner.next();
               student.setName(name3);

               System.out.println("Enter new student address");
               String address3 = scanner.next();
               student.setAddress(address3);
               arr[2] = student;
               System.out.println("New Student Record Updated");
               for (int i = 0; i < arr.length; i++) {
                  arr[i].addStudent();
               }

            break;
            default:
               System.out.println("Invalid Roll Number");
         }
      }


       void exitStudent() {
          System.out.println("Exit From Student");
       }




   }