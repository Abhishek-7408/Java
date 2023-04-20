import java.util.Scanner;
public class arraaysearch {
    public static void main(String[] args){
        int a[],n,count=0;
        int a = new int a[5];
        Scanner r = new Scanner(System.in);
        System.out.println("Enter Array Elements:");
        for(int i=0;i<=a.length;i++){
            System.out.println(a[i]+" ");

        }
        System.out.println( "Enter Search Element");
        n = r.nextInt();
        for(int i=0;i<=a.length;i++){
            if(a[i] == n){
                count++;
            }
        }
        if(count>0)
        System.out.println("Item found");
        else
        System.out.println("Item  not found");




        

    }
    
}
