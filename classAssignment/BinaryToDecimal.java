import java.util.Scanner;
class BinaryToDecimal
{
   private long binaryNum;

   public void setBinaryNum(long binaryNum){
       this.binaryNum=binaryNum;
   }

   public long getBinaryNum(){
       return binaryNum;
   }


   void convert(long binaryNum){
      this.binaryNum=binaryNum;
      double decimalNum=0;
          for(int i=0;binaryNum>0;i++){
              long temp =binaryNum%10;
              decimalNum += temp*(Math.pow(2, i));
              binaryNum=binaryNum/10;
              // System.out.println("Decimal number: "+decimalNum);

      }
       System.out.println("Decimal number: "+decimalNum);


   }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BinaryToDecimal binaryToDecimal=new BinaryToDecimal();
        System.out.println("Enter binary number");
        long binaryNum=scanner.nextLong();

        binaryToDecimal.convert(binaryNum);


    }

}