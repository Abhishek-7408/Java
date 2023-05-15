
import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        int a,b,temp;
        System.out.println("Enter The Value of a & b");

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("BEfore Swap"+a+" "+b);
        temp = a;
        a = b;
        b =temp;
        System.out.println("After Swap:"+a+" "+b);

    }
    
}
