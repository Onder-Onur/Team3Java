
public class Peek {
    public static int Peek(int[] nums){
        int Peek = Integer.MIN_VALUE;

        if(nums[0]>nums[1]){
            Peek=nums[0];
        }
        if (nums[nums.length-1]>nums[nums.length-2]){
            if(nums[nums.length-1]>Peek){
                Peek=nums[-1];
            }
        }

        for (int i = 1; i < nums.length-1; i++) {
            if ((nums[i]>nums[nums[i-1]])&&(nums[i]>nums[nums[i+1]])){
                if (nums[i]>Peek){
                    Peek=nums[i];
                }
            }
        }
        return Peek;
    }
    public static void main(String[] args) {
        int[] numbers = {11,1,5,7,10,3,5,7,9,4,3,2,1};

        int peek = Peek(numbers);

        if (peek==Integer.MIN_VALUE){
            System.out.println("There is no peek number in this Array");
        }else {
            System.out.println("The max peek number in this Array is= "+peek);
        }
    }
}
