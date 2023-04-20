import java.util.Scanner;
public class voting {
    public static void main(String[] args) {
        int age;
        System.out.println("Hii, Welcome to Election Portal");
        System.out.println("Enter age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if(age>=18){
            System.out.println("You Can Vote");

        }
        else{
            System.out.println("You can't Vote!");

        }
    }
    
}
