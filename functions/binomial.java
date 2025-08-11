import java.util.*;

public class binomial {
    public static int fact(int a){
        int f =1;
        for(int i=1;i<=a;i++){
            f = f*i;
        }
        return f;

    }
    public static int bino_cof(int n, int r){
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nr = fact(n - r);

        int binomial_coff = fact_n/(fact_r * fact_nr);
        return binomial_coff;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();


        int cal = bino_cof(n,r);
        System.out.println("the binomial coeeficient is: "+cal);
    }
    
}
