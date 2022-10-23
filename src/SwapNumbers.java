public class SwapNumbers {
    public static void main(String[] args) {
//        Numbers -- Swap Numbers
//        Swap two variable' values without using a third variable

//        Solution 1:

        int  a = 10;      int  b  = 20;

        a = a +b;

        b = a - b;

        a = a - b;

        System.out.println(a+" "+b);

//        Solution 2:

        int  c = 10;      int  d  = 20;

        c = c^d;

        d = c^d;

        a = a^b;
    }
}

