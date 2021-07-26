package dsAlgoInJava;

public class distributeInCircle {
public static int distribute(int A, int B, int C){
    int n =0;
    n = (A+C -1) % B;
    if(n==0){
        return B;
    }
    return n;
}


    public static void main(String[] args){
      System.out.println(distribute(8,5,2));
    }

}
