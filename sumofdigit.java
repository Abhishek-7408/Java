import java.util.Scanner;
public class sumofdigit {
    public static void main(String[] args) {
        int n,r,sum = 0;
        System.out.println("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n>0)
        {
            r = n%10;
            sum = sum + r;
            n = n/10;

        }
        System.out.println("Sum is: "+sum);

    }
    
}
