import java.util.*;
public class hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hcf = 1;
        System.out.println("enter a first no: ");
        int m = sc.nextInt();

        System.out.println("enter a second no: ");
        int n = sc.nextInt();

        for(int i=1; i<=m || i<=n; i++){
            if(m%i ==0 && n%i==0 ){
               hcf =i;
            }
        }
        System.out.println(hcf);


    }
}
