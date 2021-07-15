package dsAlgoInJava;

import java.util.Arrays;

public class allFactors {

    public static int []  allFactor(int A){
         int[] res;
         int j= 0;
         res = new int [60];
         for(int i=1 ; i<=A ; i++){
           if(A%i==0){
               res[j] = i;
               j++;
           }
       }
       return res;
    }



    public static void main(String[] args) {
       System.out.println("hello");

       allFactor(38808);
    }
}
