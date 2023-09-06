class Calculator{
   private int num1,num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    void addition()
    {
        int num3=num1+num2;
        System.out.println("Addition is: "+num3);
    }
    void substraction(){
        int num3=num1-num2;
        System.out.println("Substraction is: "+num3);
    }
    void multiplication(){
        int num3=num1*num2;
        System.out.println("Multiplication is: "+num3);
    }
    void division(){
        int num3=num1/num2;
        System.out.println("Division is: "+num3);
    }
}