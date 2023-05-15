import java.util.Scanner;


public class factor {
    public static void main(String[] args) {
    int n;
        System.out.println("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i+" ");
            }
        }

    }
    
    
}
