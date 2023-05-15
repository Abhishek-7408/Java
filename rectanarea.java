import java.util.Scanner;
public class rectanarea {
    public static void main(String[] args) {
        double length,breath,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value of length");
        length = sc.nextDouble();
        System.out.println("Enter Value of breath");
        breath = sc.nextDouble();
        area = length*breath;
        System.out.println("Area is : "+area);

    }

    
}
