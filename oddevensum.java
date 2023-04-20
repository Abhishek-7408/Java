
import java.util.Scanner;
public class oddevensum {
    public static void main(String[] args){
        int n,i,sum=0;
  System.out.println("Enter the Numbers of terms:");
  Scanner sc = new Scanner(System.in);
  n = sc.nextInt();
  if(n%2==0){
    for(i= 0; i<=n;i=i+2){
        sum = sum + i;
    }
  System.out.println("Sum of even is:"+sum);

  }
  else{
    for(i=1;i<=n;i=i+2){
        sum = sum +i;

    }
  System.out.println("Sum of odd is:"+sum);

  }
  
    }

    
}
