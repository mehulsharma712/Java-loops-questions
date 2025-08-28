public class FactorialNumber {

    public static void main(String[] args) {
        int n=5;
        int result=1;

        for(int i=1;i<=n;i++){
            result*=i;  //Print result in each iteration
            
        }

        System.out.println("Factorial of "+ n + " is "+result);
    }
    
}
