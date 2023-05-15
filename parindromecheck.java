
import java.util.Scanner;
public class parindromecheck {
    public static void main(String[] args) {
        int n,s=0,r,c;
        System.out.println("Enter any Number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c = n;
        while(n>0){
            r = n%10;
            s = s*10+r;
            n = n/10;
        }
        if(c==s){
            System.out.println("Number is parindrome");
        }
        else{
            System.out.println("Not Parindrome");
        }
    }
    
}
