import java.util.Scanner;
public class changechar {
   public static void main(String[] args) {
    char ch,ch2;
    System.out.println("Enter Character: ");
    Scanner sc = new Scanner(System.in);
    ch = sc.next().charAt(0);
    if(ch>='A' && ch<='Z'){
        ch2=Character.toLowerCase(ch);
        System.out.println(ch2);


    }
    else{
        ch2=Character.toUpperCase(ch);
        System.out.println(ch2);

    }
    
   }
}
