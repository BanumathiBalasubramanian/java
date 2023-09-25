public class Methods {
    public static void main(String args[]) {
        add1();  //function call
        add1(5, 5);
        System.out.println((add2(1, 2)));
        int res = add2(1, 2);
        res = res * 10;
        System.out.println(res);
        add3();


    }

    public static void add1() {      //function definition //void function without parameters
        int a = 5;                   //function declaration
        int b = 10;
        int c = a + b;
        System.out.println("c is " + c);

    }

    public static void add1(int c, int d) {     //void function with parameters
        int e = c + d;
        System.out.println("e: " + e);
    }

    public static int add2(int a1, int b1) {     //non void function,with parameters
        int c1 = a1 + b1;
        return c1;

    }

    public static int add3() {    //non void function,without parameters
        int a = 10;
        int b = 10;
        int c = a + b;
        System.out.println("the value" + c);
        return c;
    }

}
