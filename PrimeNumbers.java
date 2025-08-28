public class PrimeNumbers {

    public static void main(String[] args) {
        int n=6;
        boolean IsPrime=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                IsPrime=false;
            }
        }

        if(IsPrime==true){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not prime");
        }
    }
    
}
