import java.util.Scanner;

public class un {
    static int logic(int a,int b){

        int c;
        if(a>b){
            c=a+b;
        }
        else{
            c=a+b/5;
        }
        return c;

    }

    public static void main(String[] args) {
        int x,y,z;
        System.out.println("Enter x & y");
        Scanner sc = new Scanner(System.in);
         x=sc.nextInt();
         y=sc.nextInt();
         z=logic(x,y);
         System.out.println(z);
    }
    
}
