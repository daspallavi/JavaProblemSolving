package dsAlgoInJava;

public class verifyPrime {

    public static int ifPrime(int A){
        if(A==1){
            return 0;
        }
 int sq = (int)Math.sqrt(A);
        for(int n=2; n<=sq; n++){
            if(A%n ==0){
                int a = n;
                int b = A/n;

                if(a<sq && b>sq || a==b){
                    return 0;
                }
            }
        }
        return 1;
    }
    public static void main(String[] args) {
            System.out.println(ifPrime(19));
    }
}
