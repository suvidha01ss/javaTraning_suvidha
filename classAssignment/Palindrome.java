import java.util.*;
class Palindrome{
    Scanner scanner=new Scanner(System.in);
    void checkPalindrome(){
        System.out.println("Enter the String to check");
        String str=scanner.next();
        char[] ch=str.toCharArray();
        int j=str.length-1;
        for (int i=0;i<str.length-1;i++){
            if(ch[i]!=ch[j]){
                break;
            }
            j--;
            System.out.println(str+"paindrome");

        }

    }

    public static void main(String[] args) {

    }

}