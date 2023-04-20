import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        int a,b,c,d,e;
        System.out.println("Enter the Valur of Subjects: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        int sum = a+b+c+d+e;
        System.out.println("Sum is "+sum);
        double average = sum/5.0;
        System.out.println( "And average is :"+average);


    }
    
}
