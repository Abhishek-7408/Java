import java.util.Scanner;
public class factoria {
    public static void main(String[] args) {
        int n,fact=1;
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println("Factorial of number is:"+fact);
    }
    
}
