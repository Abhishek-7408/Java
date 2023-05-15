
import java.util.Scanner;
public class swapwiththi {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter values:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Before Swap"+a+" "+b);
        a = a+b;
        b= a-b;
        a=a-b;
        System.out.println("After Swap"+a+" "+b);

    }
    
}
