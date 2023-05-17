import java.util.Scanner;

public class Factoriall {
    public static void factorial(int n)
{
    int fact=1;
    for(int i=n;i>=1;i--){
        fact = fact*i;
    }
    System.out.println(fact);
}  
public static void main(String[] args) {
    System.out.println("Enter VAlue of n");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(n);


}  
}
