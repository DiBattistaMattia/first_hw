package fibonacci;

/*
 * the main class calculate the fibonacci's
 * series of number n
 * F(n) = F(n-1) + F(n-2) 
 *
 */

public class Main {

    public static void main(String[] args) {

        int n = 10, n_1 = 0, n_2 = 1, sum = 0;
        System.out.print("First " + n + " terms: \n");

        for (int i = 1; i <= n; ++i){
        	
        	System.out.print(sum + "\n");        	
            sum = n_1 + n_2;
            n_1 = n_2;
            n_2 = sum;
        }
    }
}