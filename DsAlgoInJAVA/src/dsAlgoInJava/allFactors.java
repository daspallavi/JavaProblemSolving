package dsAlgoInJava;

import java.util.ArrayList;
import java.util.Arrays;

public class allFactors {

//    public static int []  allFactor(int A){
//         int[] res;
//         int j= 0;
//         res = new int [60];
//         for(int i=1 ; i<=A ; i++){
//           if(A%i==0){
//               res[j] = i;
//               j++;
//           }
//       }
//       return res;
//    }

    public static ArrayList<Integer> allFac(int A){
        ArrayList<Integer> factors = new ArrayList<>();
        ArrayList<Integer> start = new ArrayList<>();
        ArrayList<Integer> end = new ArrayList<>();

        for(int i =1; i <= Math.sqrt(A); i++){
            if(A%i ==0){
                int a=i;
                int b = A/i ;
                if(a !=b){
                    start.add(a);
                    end.add(b);
                }else{
                    start.add(a);
                }
            }
        }

        for(int num : start ){
            factors.add(num);
        }

        for(int j =end.size()-1 ; j >=0; j -- ){
            factors.add(end.get(j));
        }

       return factors;
    }


    public static void main(String[] args) {
       System.out.println("hello");
//Simple Solution
      // allFactor(38808);
        allFac(45);
        // more efficient solution

    }
}
