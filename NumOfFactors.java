public class NumOfFactors {
    public static void main(String[] args) {
        int n=20;
        int counter=0;

        for(int i=1;i<=n;i++){
            if(n%i==0){
            counter++;
            }

        }
        System.out.println(counter);
    }
    
}
