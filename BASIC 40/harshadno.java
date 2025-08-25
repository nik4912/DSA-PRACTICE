import java.util.*;

public class harshadno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp =n;
        int sum = 0;

        while(temp>0){
            int rem = temp%10;
            sum = sum + rem;
            temp /= 10;
        }
        if(n % sum ==0){
            System.out.println("it is harshad no: ");
        }
        else{
            System.out.println("it is not harshad no: ");
        }
    }
   

    
}
