public class Scoping {
    public static void main(String[] args) {
        int a=10;
        {
//            int a=20; you cannot reinitialize the variable as it is already decalre in the function.
            int c=20;
        }
//        c=50 you cannot access the variable outside the block which is declare in the block..
//        Basically what happens is that anything which is declare outside the block cannot reinitialize inside the block
//        Or Anything initialized inside the block cannot accessable outside the block...


//        loop Scoping
        for (int n = 0; n < 5; n++) {
            a=50;
            int num=90;
        }
//        System.out.println(num); you cannot acces the num outside the loop as it is intialized inside the loop..
    }
    static void newMethod(){
//        System.out.println(a); you cannot access a in other method or function as it is declare in other function you have declare other variable..
    }
}
