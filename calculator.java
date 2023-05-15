import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        int n1,n2;
        double cal;
        char ch;
        System.out.println("Enter Numbers: ");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        ch = sc.next().charAt(0);


        System.out.println("Enter operation: ");
        if(ch == '+')
        {
        cal = n1+n2;
        System.out.println("Addition is "+cal);
        }
        else if(ch == '-'){
            cal = n1-n2;
            System.out.println("Subtraction is :"+cal);
        }
        else if(ch == '*'){
            cal = n1*n2;
            System.out.println("Multiplication is :"+cal);
        }
        else if(ch == '/'){
            cal = n1/n2;
            System.out.println("Division is:"+cal);

        }
        else {
            cal = n1%n2;
            System.out.println("Modulus is:"+cal);
        }
        
    }
    
}
