
import java.util.Scanner;
public class noofdayinmonth {
    
    public static void main(String[] args) {
        int n;
        System.out.println("Enter Value of month");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n==1)
        {
            System.out.println("JAnaury : Day =31");
        }
        else if(n==2)
        {
            System.out.println("February = 28days");
        }
        else if(n==3)
        {
            System.out.println("March = 31days");
        }

    }
}
