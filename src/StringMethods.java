import java.util.Arrays;

public class StringMethods {
    public static void main(String args[]){
        // String declared as object
        String firstName1 = new String("Banu");
        System.out.println(firstName1);

        //different string methods
        //1. To find the length of the string
        String a= "Banu mathi B";
        System.out.println("lenght of string: "+a.length());

        //2. To convert to Uppercase and lowercase
        String upper="BanuMathi";
        System.out.println("Uppercase: "+upper.toUpperCase());
        System.out.println("Lowercase: "+upper.toLowerCase());

        //3. To find the index of the string
        String name="BANUMATHI QA";
        System.out.println(name.indexOf("B"));
        System.out.println(name.indexOf("N"));
        System.out.println(name.indexOf("QA"));

        //4. concatenation of two string
        String s1="Blue";
        String s2="Star";
        System.out.println(s1+s2);  //or we can use concat() method
        System.out.println(s1.concat(s2));

        //5. compare of two string
        String a1= "Banu";
        String a2= "swathi";
        System.out.println(a1.compareTo(a2));

        //6. contains method
        String b1 = "SWATHI";
        System.out.println(b1.contains("A"));

        //7. Equals (compare content,uppercase,lowercase)
        System.out.println(a2.equals(b1));
        String c1="swathi";
        System.out.println(a2.equals(c1));

        //8.Equals ignore case (only content matches return true, ignoring uppercase,lowercase)
        String e1="Testing";
        String e2="testing";
        String e3="manual";
        System.out.println(e1.equalsIgnoreCase(e2)); //true
        System.out.println(e1.equalsIgnoreCase(e3)); //false

        //9.Replace a character in string
        String g = "Hello";
        System.out.println(g.replace('l', 'p'));

        //10.Starts with
        String h = "Hello";
        System.out.println(h.startsWith("Hel"));   // true
        System.out.println(h.startsWith("llo"));   // false
        System.out.println(h.startsWith("o"));     // false

        //11. is empty string
        String i1 = "Hello";
        String i2 = "";
        System.out.println(i1.isEmpty());
        System.out.println(i2.isEmpty());

        //12. Substring extract substring from index 0 to 3
        String str1 = "java is fun";
        System.out.println(str1.substring(0, 4));

        //13. charAt -returns character at index 2
        String str2 = "Java Programming";
        System.out.println(str1.charAt(2));

        //14. trim()- method removes any leading (starting) and trailing (ending) whitespaces from the specified string.
        String str3 = "   Learn Java Programming      ";
        System.out.println(str1.trim());

        System.out.println("-------- session learnings----------");
        int bonusAmount = 100;
        String orderNumber = "SO#2130157703T20230720";
        String orderValue = "$45,000";
        String firstName="banu";
        //String replace(CharSequence old, CharSequence new)
        String newOrderValue = orderValue.replace("$","").replace(",","");
        System.out.println(newOrderValue);

        //String[] split(String regex)
        System.out.println(Arrays.toString(firstName.split(" ")));

        //Converting Integer to String
        //static String valueOf(int value)
        System.out.println(String.valueOf(bonusAmount));

        //Converting String to Integer
        int i = Integer.parseInt(newOrderValue) + bonusAmount;
        System.out.println("Order Total: "+i);
    }
}
