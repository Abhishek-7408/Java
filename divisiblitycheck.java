import java.util.Scanner;
public class divisiblitycheck {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter Number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n%5==0)
        {
            System.out.println("Number Is divisible by 5");

        }
        else
        {
            System.out.println("Number is not divisible by 5");
        }
    }
    
}
