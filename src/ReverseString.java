public class ReverseString {
    public static void main(String[] args) {
        String str = "Deneme1 2";
        System.out.println(StrReverse(str));
    }
    public static String StrReverse(String str) {

        String reverse="";

        for(int i=str.length()-1; i >= 0; i--)

            reverse += str.toCharArray()[i];



        return  reverse;

    }
}
