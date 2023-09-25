class Object2 {    //class 1 having fields & methods
    String name;
    int age;

    public void display() {      //methods
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }
    public void setValues(String a,int b){
        a=name;
        b=age;
    }
}
class NewClass1{    //class accessing those above template with main class below
    public static void main(String args[]) {


        Object2 objN = new Object2();   //object 1 creation
        objN.setValues("Banu",22);            //object using the class fields as template
        objN.display();                 //object using class methods to print

        /*AppForm obj2 = new AppForm();       //object 2
        obj2.name = "Swathi";
        obj2.age = 25;
        obj2.display();

         */
    }
}