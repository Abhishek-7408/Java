import java.util.Scanner;
public class checkvovelconst {
    public static void main(String[] args){
      char ch;
      System.out.println("Enter Character:");
      Scanner sc = new Scanner(System.in);
      ch=sc.next().charAt(0);
      if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'  )
      {
        System.out.print("Vovel");
      }
      else
      {
        System.out.print("Const");
      }

    }
    
}
