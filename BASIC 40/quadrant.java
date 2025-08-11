import java.util.*;
public class quadrant {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x co-ordinate");
        int x = sc.nextInt();
        System.out.println("enter y co-ordinate");
        int y = sc.nextInt();

        if(x>0 && y>0){
            System.out.println("Quandrant I" );
        }
        else if(x<0 && y>0){
            System.out.println("Quandrant II");
        }
        else if(x<0 && y<0){
            System.out.println("Quandrant III");
        }
        else if(x>0 && y<0){
            System.out.println("Quandrant IV");
        } 
        else{
            System.out.println("Origin");
        }

    }
}