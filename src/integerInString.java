import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class integerInString {


    public static void main(String[] args) {
        String str = "H3llo 7orl5";

        char [] charArr = str.toCharArray();

        System.out.println(charArr);
        int result = 0;
        for(char each:charArr){
            if(Character.isDigit(each)){
                result+= Integer.parseInt(""+each);
            }
        }
        System.out.println(result);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2,5,8,0,5,3,7,9,3,0,2));

        System.out.println(numbers);

        numbers.removeAll(Arrays.asList(0));


        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println(numbers);


    }

}
