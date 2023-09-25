//two class -1.Object,2.NewClass
//second class contain main function


class Object {    //class 1 having fields & methods
     String name;
     int age;

     public void display() {      //methods
         System.out.println("name:" + name);
         System.out.println("Age:" + age);
     }
 }
 class NewClass{    //class accessing those above template with main class below
     public static void main(String args[]) {

         Object obj1 = new Object();   //object 1 creation
         obj1.name = "Banu";               //object using the class fields as template
         obj1.age = 21;
         obj1.display();                 //object using class methods to print

         Object obj2 = new Object();       //object 2
         obj2.name = "Swathi";
         obj2.age = 21;
         obj2.display();
     }
 }
