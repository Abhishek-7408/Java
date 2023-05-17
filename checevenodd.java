import java.util.Scanner;
public class checevenodd {
    public static void evenOdd(int n){
        if(n%2==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }




    }
    public static void main(String[] args) {
        System.out.println("Enter Number");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        evenOdd(n);
    }
   
    
}
