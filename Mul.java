import java.util.Scanner;

public class Mul {
    public static int calculateMul(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        System.out.println("Enter Value");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(calculateMul(a, b));
    }
    
}
