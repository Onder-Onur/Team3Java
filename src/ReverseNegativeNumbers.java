public class ReverseNegativeNumbers {
    //    (Number) Reverse Negative Number
//    Write a return method that can reverse negative number and return it as int


    public static int reverseNum(int  num) {

        String str = new StringBuilder(""+num).reverse().toString();

        if(num < 0) {

            str = "-"+str.substring(0, str.length()-1);

        }

        return Integer.valueOf(str);

    }
}
