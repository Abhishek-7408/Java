import java.util.Scanner;

public class class1 {

    double width;
    double height;
    double depth;

    double vol(){
        return (width*height*depth);
        System.out.println("Enter Value: ");
        Scanner sc = new Scanner(System.in);
        width = sc.nextDouble();
        height = sc.nextDouble();
        depth = sc.nextDouble();
        System.out.println(vol);
    }
}
