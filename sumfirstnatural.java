import java.util.Scanner;
public class sumfirstnatural {
    public static void main(String[] args)
    {
int n,sum=0;
System.out.println("Enter No. of terms:");
Scanner sc = new Scanner(System.in);
n = sc.nextInt();

for(int i = 1;i<=n;i++)
{
sum = sum + i;
}
System.out.print("Sum is :" + sum);

    }
    
}
