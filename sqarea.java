import java.util.Scanner;
public class sqarea {
    public static void main(String[] args) {
        int s1,s2,area;
        java.util.Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of Side1:");
        s1 = sc.nextInt();
        System.out.println("Enter Value of Side2: ");
        s2 = sc.nextInt();
        area = s1*s2;
        System.out.println("Area is: "+area);


    }
    
}
