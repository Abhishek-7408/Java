import java.util.Scanner;
public class greatestofthree {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enters the Numbers: ");
        Scanner sc = new Scanner(System.in);
  a = sc.nextInt();
  b = sc.nextInt();
  c = sc.nextInt();
  if(a>b){
    if(a>c)
        System.out.println(a);
        else{
            System.out.println(c);
        
    }
  }
  else{
    if(b>c){
        System.out.println(b);
    }
    else{
        System.out.println(c);
    }
  }

  
  
    }
    
}
