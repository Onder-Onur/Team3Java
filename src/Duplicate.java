import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicate {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(2,4,6,7,9,0,6,3,5,7,9,4,2,7,0));
        ArrayList<Integer> duplicate = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            int count = 0;
            for (Integer each:numbers){
                if (each.equals(numbers.get(i))){
                    count++;
                }
            }
            if(count>1&&!duplicate.contains(numbers.get(i))){
                duplicate.add(numbers.get(i));
            }
        }
        System.out.println(duplicate);

        numbers.removeAll(duplicate);
        System.out.println(numbers);

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.addAll(Arrays.asList(2,4,6,7,9,0,6,3,5,7,9,4,2,7,0));
        ArrayList<Integer> duplicate2 = new ArrayList<>();

        for (Integer each1:numbers2){
            int count2 = Collections.frequency(numbers2,each1);

            if(count2>1 && !duplicate2.contains(each1)){
                duplicate2.add(each1);
            }
        }
        System.out.println(duplicate2);
        System.out.println(Collections.max(duplicate2));
        System.out.println(Collections.min(duplicate2));
        Collections.swap(duplicate2, 0,5);
        System.out.println(duplicate2);

    }

}
