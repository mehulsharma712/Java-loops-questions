public class PerfectSqr {

    public static void main(String[] args) {
        int num=4;
        
        int sqrt=(int)Math.sqrt(num);

        if(sqrt*sqrt==num){
            System.out.println(num+" is a perfect square");
        }else{
            System.out.println(num+" is not a perfect square");
        }
    }
    
}
