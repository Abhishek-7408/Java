import java.util.Scanner;

public class Function {
    //public static void printMyName(String name){
      //  System.out.println(name);
      //  return;
   // }
    //public static void main(String[] args) {
     //   System.out.println("Enter name:");
    //    Scanner sc = new Scanner(System.in);
    //    String name = sc.next();
     //   System.out.println("Your name is:");
    //    System.out.println(name);
   // }
   public static void printFactorial(int n){
    int factorial = 1;
    for(int i=n;i>=1;i--){
        factorial = factorial*i;
        return;
    }

   }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printFactorial(n);
   }
    
}
