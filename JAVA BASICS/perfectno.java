import java.util.*;
public class perfectno{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        System.out.print("enter a no: ");
        int n= sc.nextInt();

        for(int i=1;i<n;i++){
            if(n%i ==0){
                sum = sum+i;
            }
        }
        if(sum == n){
            System.out.print("its is perfect no");
        }
        else{
            System.out.println("not a perfect no");
        }

    }
    
}
