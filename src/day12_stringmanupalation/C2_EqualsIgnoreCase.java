package day12_stringmanupalation;

public class C2_EqualsIgnoreCase {
    public static void main(String[] args) {

        //equalsIgnoreCase() method'u karsilastirdigi stringlere case sensitive (buyuk kucuk harf duyarliligi)
        //olmaksizin bakar
        String str1 = "Ali Can";
        String str2 = "ali CAN";
        String str3 = "Ali can ";

        System.out.println(str1.equals(str2)); //case sensitive False

        System.out.println(str1.equalsIgnoreCase(str2)); // true

        System.out.println(str1.equalsIgnoreCase(str3)); //false



    }
}
