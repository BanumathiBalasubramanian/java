public class Conditions {
    public static void main(String args[]) {
        int x = 5;
        //If else condition
        System.out.println("If else condition");
        if (x == 10)
            System.out.println("x is greater");
        else
            System.out.println("x is smaller");
//-----------------------------------------------
        //If else if condition
        System.out.println("If else if condition");
        if (x >= 10)
            System.out.println(x + " is lesser than 10");
        else if (x >= 20)
            System.out.println(x + "is higher than 10");
        else
            System.out.println(x);
//----------------------------------------------------
        //nested if else
        System.out.println("nested if else");
        int a = 2;
        int b = 2;
        int c = 2;

        if (a == b) {
            // nested if else condition to check if c is equal to a and b
            if (a == c) {
                // all are equal
                System.out.println("Equal");
            } else {
                // a!=c
                System.out.println("Not equal");
            }
        } else {
            // a!=b
            System.out.println("Not equal");
        }
//-------------------------------------------------
        //nested if statements
        System.out.println("nested if statements");
        int a1 = 5;
        if (a1 > 3)  //it check all the if condition, if it is ture it print all the result
            System.out.println("greater");
        if (a1 == 5)
            System.out.println("equals");
        if (a1 < 12)
            System.out.println("lesser than 12");
//-------------------------------------------------
        //switch condition
        System.out.println("switch condition");
        int day = 5;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;  //to jump out of condition,when it is true
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default: //if value is not match with case value, then default will execute
                System.out.println("happy weekend");
        }
//---------------------------------------------------------
        //break statement
        System.out.println("break statement");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        //continue statement
        System.out.println("continue statement");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
        //-----------------------------------------------------

        //Boolean operator (&& AND, || OR, == EQUALS, != NOT EQUALS)
        System.out.println("Boolean operator");
        int p = 10;
        int q = 20;
        int r = 30;

        if (p > q && p > r)  //&& AND operator
            System.out.println("and operator");
        else if (p < q || p < r)   // OR || operator
            System.out.println("OR operator");
        else if (p == q)   //equals to operator
            System.out.println("Equals to operator");
        else if (p != r)   //NOT equal operator
            System.out.println("not equal operator");

        //-----------------------------------------------------
        System.out.println("while");
        //while,do while,for,nested for,switch with two case fields,

    }
    }




