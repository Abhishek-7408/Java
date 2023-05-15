import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class positiveneg {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter Number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n>0)
        {
            System.out.println("+ve Number"+n);
        }
        else if(n<0)
        {
            System.out.println("-ve Number"+n);

        }
        else{
            System.out.println("neither +ve nor -ve");

        }
    }
    
}
