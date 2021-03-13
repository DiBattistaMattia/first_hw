package fibonacci;

public class Main {

	//F(n) = F(n-1) + F(n-2) 
    public static void main(String[] args) {

        int n = 510, n_1 = 0, n_2 = 1, sum = 0;
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i){
        	
        	System.out.print(sum);
        	if (i < n){System.out.print(" + ");}
        	
            sum = n_1 + n_2;
            n_1 = n_2;
            n_2 = sum;
        }
    }
}
