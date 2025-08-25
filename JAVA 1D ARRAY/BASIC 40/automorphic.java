import java.util.*;

public class automorphic {
    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int square = n*n;

        if(n%10 == square%10){
            System.out.print("it is automorphic");
        }
        else{
            System.out.println("it is not automorphic no");
        }
         n /= 10;
         square /=10;


    }
}

    

