import java.util.Scanner;

public class decimaltobinary {
    public static int db(int dec) {
        int pow = 0;
        int bin = 0;

        while(dec > 0) {
            int rem = dec % 2;
            bin = bin + (rem * (int)Math.pow(10,pow));
            pow ++;
            dec /= 2;
        }
        return bin;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dec = sc.nextInt();
        int b = db(dec);
        System.out.println(b);
    }
    
}
