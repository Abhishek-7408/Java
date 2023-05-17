import java.util.Scanner;

public class printsum {
    public static int printSum(int a,int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(printSum(a, b));

    }
    
}
