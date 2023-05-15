import java.util.Scanner;
import java.lang.Math;


public class trianarea {
    public static void main(String[] args) {
        int a,b,c,sp;
        double area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sp = (a+b+c)/2;
        area = Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
        System.out.println("Area of triangle is:"+area);

    }
    
}
