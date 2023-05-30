public class varargs {
    static int um(int ...arr){
        int result =0;
       for(int e:arr){
        result+=e;
       } 
       return result;
    }
    public static void main(String[] args) {
        System.out.println("um of"+um(5,4));
        
    }
    
}
