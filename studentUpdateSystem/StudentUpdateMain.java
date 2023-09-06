import java.util.Scanner;
class StudentUpdateMain{
    public static void main(String[] args) {

        StudentUpdate studentUpdate = new StudentUpdate();
        Scanner scanner = new Scanner(System.in);
        int ch=0;

        do {


            System.out.println("Enter your choice \n 1: Adding Given Student Data . \n 2:Update New Student Data Using rollNo. " +
                    "\n 3:Exit From Student ");
            ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    studentUpdate.addStudent();
                    break;

                case 2:
                    studentUpdate.updateStudent();
                    break;


                case 3:
                    studentUpdate.exitStudent();
                    break;

                default:
                    System.out.println("Invalid Input");
            }

        }
        while (ch!=3);
    }
}