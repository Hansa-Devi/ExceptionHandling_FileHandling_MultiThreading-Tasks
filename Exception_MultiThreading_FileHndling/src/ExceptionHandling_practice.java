public class ExceptionHandling_practice {
    public static void main(String[] args) {
        // throw and catch by default
//        System.out.println(3/0);


        // default throw , catch by developer
//        try{
//            System.out.println(3/0);
//        }
//        catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println("Exception catch:");

        //throw b developer catch default

//        int a=5;
//        int b = 6;
//        if (a<b) throw new ArithmeticException("a is smaller than b");
//
//        System.out.println("Throw by developer catch default");

        // throw and catch by developer
        int b= 25;
        int c= 5;
        try {
            if (b>c) throw new ArithmeticException("c is smaller than b");
            int a = c/b;
            System.out.println(a);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Program ends:");



    }
}
