public class StringPool {

    public static void main(String[] args) {
        String str1="String value";
        String str2=new String("String value");
        String str3="String value";
        String str4=str1;
        String str5=new String("String value").intern();

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1==str4);
        System.out.println(str1==str5);








    }
}
