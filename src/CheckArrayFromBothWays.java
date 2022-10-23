public class CheckArrayFromBothWays {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,4,3,2,1};
        int k = numbers.length-1;
        boolean check= true;
        for (int i = 0; i < (numbers.length/2)-1; i++) {
            if (numbers[i]!=numbers[k]){
                check=false;
                k--;
            }else {
                k--;
            }
        }
        System.out.println(check);

        String s = "One"+1+2+"Two"+3+4+"Three"+5;
        System.out.println(s);
    }



}
