import java.util.Scanner;

public class Modulus {

    // (X*Y) % N = Z
    public static int calculate(int N, int Z){
        int pairs = 0;
        if(N == 0 || Z == 0){
            return 0;
        }
        for (int x = 0; x < N; x++) {
            for(int y = 0; y<N; y++){
               if((x*y) % N == Z){
                   pairs++;
               }
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Z = sc.nextInt();
        System.out.println(calculate(N,Z));
    }

}
