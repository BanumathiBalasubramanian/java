public class Student extends Parent {

    String name;
    int age;
    double mark;
    private static int Salary=10000;


    public Student(String name, int age, double mark,String fName,String mName){
        super(fName,mName);
        this.name = name;
        this.age= age;
        this.mark = mark;


    }

    public void details() {

        System.out.println(name +" "+age+" "+mark+fatherName+" "+motherName);
    }

public static void mySalary(){
    System.out.println(Salary);
}
}
