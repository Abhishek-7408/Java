import java.util.Scanner;


import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int n,fact=1
        ;
        System.out.println("Enter any Number:");
        Scanner sc = new Scanner(System.in);
n = sc.nextInt();
for(int i =1;i<=n;i++){
    fact = fact*i;
}
System.out.println("factorial os :"+fact);

    }
    
}
