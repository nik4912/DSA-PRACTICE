import java.util.*;
   
public class sortornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array: ");
        int t = sc.nextInt();
        int org[] = new int[t];
        System.out.println("enter element of array: ");
        for(int i=0;i<org.length;i++){
            org[i] = sc.nextInt();
        }
        int arr2 [] = Arrays.sort(org);
        System.out.println("the new array: ");
        for(int i = 0; i < org.length; i++) {
            System.out.print(org[i] + " ");
        }
        System.out.println();

        
    }
    
}

    

