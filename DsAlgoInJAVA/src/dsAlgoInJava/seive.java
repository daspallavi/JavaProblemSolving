package dsAlgoInJava;

import java.util.ArrayList;

public class seive {

    public static ArrayList<Integer> sieve(int A){
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (A < 2) return res;
        for (int j = 2; j<=A; j++){
            if (isPrime(j)) res.add(j);
        }
        return res;
    }

    public static boolean isPrime(int B){
        for (int i =2; i<=Math.sqrt(B); i++){
            if (B%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        sieve(7);
    }
}
