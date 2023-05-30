public class strBuildr {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Abhishek");
        sb.setCharAt(5,'p');
        sb.insert(0,'a');
        sb.delete(0, 1);
        sb.setCharAt(5, 's');
        sb.delete(5, 6);
        sb.append("Kushwaha");
        
        System.out.println(sb.length());


    }
    
}
