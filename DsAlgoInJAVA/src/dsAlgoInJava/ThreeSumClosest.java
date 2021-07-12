package dsAlgoInJava;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ThreeSumClosest {

    public static int threeSumCloset(int[] num, int target){
        int result = num[0] + num[1] + num[num.length-1];
        Arrays.sort(num);

        for(int i =0; i < num.length-2; i++){
            int a_ptr = i+1;
            int b_ptr = num.length-1;

            while (a_ptr < b_ptr){
                int current_val = num[i] + num[a_ptr] +num[b_ptr];
                if(current_val > target){
                    b_ptr -=1;
                }
                else {
                    a_ptr += 1;
                }
                if(Math.abs(current_val - target) < Math.abs(result - target)){
                    result = current_val;
                }
            }


        }
        return result;
    }


    public static void main(String[] args) {
        int[] ar = {-1,2,1,-4};
      System.out.println(threeSumCloset(ar, 1));
    }


}
