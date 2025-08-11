import java.util.Scanner;

public class binarytodecimal {
    public static int bd(int bin) {
        int pow = 0;
        int dec = 0;

        while(bin > 0) {
            int rem = bin % 10;
            dec = dec + (rem * (int)Math.pow(2,pow));
            pow ++;
            bin /= 10;
        }
        return dec;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bin = sc.nextInt();
        int d = bd(bin);
        System.out.println(d);
    }
    
}
