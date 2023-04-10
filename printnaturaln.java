import java.util.Scanner;
public class printnaturaln {
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter no of terms:");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();

        for(int i=1;i<=n;i++)
        {
            System.out.println(i + " ");
        }
    }
    
}
