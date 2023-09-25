import java.sql.SQLOutput;
import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        //declaring the arraylist class, and oject called cars
        ArrayList<String> cars =new ArrayList<String>();
        // add elements(object) to the arraylist by using add() method
        System.out.println("add elements to arraylist");
        cars.add("bmw");
        cars.add("audi");
        cars.add("jeep");
        cars.add("xuv");
        cars.add("benz");
        System.out.println(cars);
        System.out.println("get elements in arraylist using index");
        System.out.println(cars.get(0));
        System.out.println(cars.get(4));
        System.out.println("set elements in arraylist using index and passing value");
        System.out.println(cars.set(0,"minicooper"));
        System.out.println(cars);
        System.out.println("--------------");
        /*//for each loop
        for (String a:cars) {
            System.out.println(a);
        }
        System.out.println("--------------");
        //for loop
        for(int i=0;i< cars.size();i++)
        {
            System.out.println(cars.get(i));
        }*/
        System.out.println("----- task 1 --------");
        System.out.println("Reverse the elements in Arraylist");
        System.out.println(cars);
        for (int i= cars.size()-1;i>=0;i--)
        {
            System.out.println(cars.get(i));
        }

        System.out.println("------Task 2 --------");
        System.out.println("Convert the ArrayList into Array");
        System.out.println(cars);
        //declaring arraylist to the array using toArray() method
        //String item[]= cars.toArray<String>();
        //printing array of oject
        /*for (String b:item) {
            System.out.println(b);
        }*/
        //---------------------------------------
        System.out.println("task 2 ------------------------");
        //declaring arraylist
        ArrayList<String> a = new ArrayList<>();
        a.add("aaaa");
        a.add("bbb");
        //syntax for array: T[] arrayname = list.toArray(new T[size of list]);
        String b[]= a.toArray(new String[a.size()]);
        for (String c:b) {
            System.out.println(c);
        }
        System.out.println("--------Task 3------------");
        System.out.println("Remove the duplicate elements from the ArrayList");
        System.out.println(cars);
        cars.add("jeep");
        System.out.println(cars);
        //sorting the elements in the arraylist using collection class
        Collections.sort(cars);
        System.out.println(cars);
        //delcaring hashset and passing the arraylist elements to remove duplicate elements
        HashSet<String> set = new HashSet<String>(cars);
        for (String ele:set) {
            System.out.println(ele);
        }

        //SET - doesnot allow duplicate elements
        System.out.println("---set -------------");
        System.out.println("------Task 4 ----Hashset-----");
        HashSet<String> setname = new HashSet<String>();
        System.out.println("adding elements in hashset");
        setname.add("aa");
        setname.add("bb");
        setname.add("cc");
        setname.add("dd");
        setname.add("ee");

        for (String sname: setname ) {
            System.out.println(sname);
        }
        System.out.println("Get the size of hashset: "+ setname.size());
        setname.add("aa"); //adding same element "aa" again
        //hashset not allowing duplicate elements
        for (String sname: setname ) {
            System.out.println(sname);
        }
        System.out.println(setname.size());

        System.out.println("removing elements");
        setname.remove("cc");
        for (String sname: setname ) {
            System.out.println(sname);
        }
       setname.clear();
        System.out.println("Get the size of hashset: "+ setname.size());
        System.out.println("-------------------------------------------------");
        System.out.println("---------task 5 ---- linked hashset");
        LinkedHashSet<String> link = new LinkedHashSet<String>();
        link.add("ba");
        link.add("nu");
        link.add("ma");
        link.add("thi");
        link.add("ba"); //duplicate is removed
        System.out.println("size of linked hashset: " +link.size() );
        for (String ln:link) {
            System.out.println(ln);
        }
        link.remove("ma");
        link.remove("thi");
        System.out.println("size of linked hashset: " +link.size() );
        for (String ln:link) {
            System.out.println(ln);
        }
        link.clear();
        System.out.println("size of linked hashset: " +link.size() );

        System.out.println("-------------------------------");
        System.out.println("----task 6 ---- Tree set --------------");
        TreeSet<String> tree = new TreeSet<String>();
        System.out.println("Adding elements in tree-set");
        tree.add("cc");
        tree.add("AA");
        tree.add("BB");
        tree.add("AA");  //duplicate is removed
        for (String tset:tree) {
            System.out.println(tset);
        }
        tree.remove("cc");  //remove one element in tree set
        for (String tset:tree) {
            System.out.println(tset);
        }
        System.out.println("---descending tree set");
        TreeSet<String> tree1 = new TreeSet<String>();
        tree1.add("A");
        tree1.add("B");
        tree1.add("C");
        tree1.add("D");
        System.out.println(tree1);
        NavigableSet<String> treereverse = tree1.descendingSet();
        for (String tr:treereverse) {
            System.out.println(tr);
        }
    }
}
