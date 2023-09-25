public class Recursion {
    public static void main(String args[]){
        //recursion concept
        naturalNum(10);
    }
    public static void naturalNum(int n){
        //Base case
        if(n==1){
            System.out.println(n);
        }
        //recursive case
        else{
            System.out.println(n);
            naturalNum(n=n-1);

        }
    }
}
