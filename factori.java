import java.util.Scanner;

public class factori {

static int factorial(int n){
    if(n==0 | n==1){
        return 1;
    }
    else{
        return n*factorial(n-1);
    }
}
    public static void main(String[] args) {
       Scanner c = new Scanner(System.in);
       int x =c.nextInt(); 
       System.out.println("VAAlue"+factorial(x));
    }
    
}
