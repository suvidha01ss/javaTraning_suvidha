 class FinalKeyword{
    final int a=10;

    final void m1(){
        int a=20;
        System.out.println(a);
    }
    void m1(int a){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        FinalKeyword finalKeyword=new FinalKeyword();
        finalKeyword.m1(40);
        finalKeyword.m1();
        System.out.println(finalKeyword.a);
    }
}
class B extends FinalKeyword{
    void m2(){
        System.out.println("hello");
    }
}