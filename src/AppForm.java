//single class-contains main function

public class AppForm {    //fields and methods are members of the class
    String name;  //fields (variables)
    int age;

    public void display(){      //methods
        System.out.println("name:"+name);
        System.out.println("Age:"+age);
    }

    public static void main(String args[]){
         AppForm obj1 = new AppForm();   //object 1 creation
         obj1.name="Banu";               //object using the class fields as template
         obj1.age=20;
         obj1.display();                 //object using class methods to print

         AppForm obj2=new AppForm();       //object 2
         obj2.name="Swathi";
         obj2.age=20;
         obj2.display();

    }
}
