import java.util.Scanner;
class Addn {
  public static void main(String[] args) 
  {
    int a,b,sum;
    System.out.println("Enter Two Numbers:");
    Scanner r = new Scanner(System.in);
    a=r.nextInt();
    b=r.nextInt();
    sum=a+b;
    System.out.println(sum);

  } 
}