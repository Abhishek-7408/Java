import java.util.Scanner;
public class circlearea {
    public static void main(String[] args) {
        int r;
        double area;
        final double PI = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius:");
        r =sc.nextInt();
        area = PI*r*r;
        System.out.println("Area of Circle is:"+area);


    }
    
}
