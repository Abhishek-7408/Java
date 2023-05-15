import java.util.Scanner;
public class tax {
    public static void main(String[] args) {
        int sal;
        double tax;
        System.out.println("Enter Salary");
        Scanner sc = new Scanner(System.in);
        sal = sc.nextInt();
        if(sal<=10000){
            System.out.println(sal+"No Tax");
            }
            else if(sal>10000 && sal<=100000){
                tax = sal*.10;
                System.out.println(sal+" "+tax);
            }
            else{
                tax = sal*.20;
                System.out.println(sal+" "+tax);
            }
        
    }
    
}
