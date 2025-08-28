public class Hcf{
    public static void main(String[] args) {
        int a=32;
        int b=48;

        int n1=Math.min(a, b);
        int n2=Math.max(a, b);

        while (n1>0) {
            int r=n2%n1;
            n2= n1;
            n1= r;
            
        }
        System.out.println(n2);
    }
    
}
