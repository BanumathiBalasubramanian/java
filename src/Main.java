import java.sql.Time;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! banu");

        //expression
        int x=3;
        int y=2;
        int z=x*y;
        System.out.println("product="+z);
        System.out.println(5*2);
        System.out.println("5*2=11");
        System.out.println(9/2); // division: quotient value as answer
        System.out.println(9%2); // mod : reminder value as answer
        System.out.println(9/2); //integer point constant
        System.out.println(9.0/2.0); //floating point constant
        System.out.println(9.0/2);
        System.out.println("No.of secs in a day " +(24*60*60));

        //string
        System.out.println("hello \"world"); // to print double cot we using before \
        System.out.println("\"hello \"world\"");
        System.out.println("hello \"world");
        System.out.println("hello \nworld");
        System.out.println("hello \tworld");
        System.out.println("hello \\world");
        System.out.println("hello \\\\world");

        // inbuild methods - casting
        //Math.abs(5.5);
        // byte,short,int float,double,long
        System.out.println(Math.abs((int)5.5));

//        Math.random();
//        Math.min(10,40);
//        Math.min(20,5);
//        Math.max(20,5);
        System.out.println(Math.random());
        System.out.println(Math.min(10,40));
        System.out.println(Math.min(20,5));
        System.out.println(Math.max(20,5));


        //%d called as modifiers - integer modifier
        System.out.println("5*2=5");
        System.out.println("5*2=10"); // println which print the value as it is in double cote
        System.out.printf("5*2 = %d",6*2).println();
        System.out.printf("%d %d %d",1,2,3).println();
        System.out.printf("%d*%d=%d",1,2,6).println();
        System.out.printf("%d*%d=%d",1,2,1*2).println();
        System.out.printf("%d+%d=%d",1,2,5).println();
        System.out.printf("%d+%d=%d",1,2,1+2).println();
        System.out.printf("%d+%d+%d=%d",5,6,7,5+6+7).println();
//Time s=new Time(2,3,45);
//        System.out.println(s.toLocalTime());
        //%s called as modifiers - string modifier
        System.out.printf("%s","Banumathi").println();
        System.out.printf("Name: %s","Banumathi").println();

        //%f called as modifiers - floating modifier
        System.out.printf("%f",5.5).println();


       Student n1= new Student("ram",12, 66.90,"mani","baby");
       n1.details();
       Student.mySalary();







    }
}