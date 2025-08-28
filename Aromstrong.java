public class Aromstrong {
    public static void main(String[] args) {
        int num=153;
        int Original=num;
        int digits=0;


        //1-First count the number of digits
        int temp=num;
        while (temp>0) {
            digits++;
            temp=temp/10;
        }

        //2-Sum of digits raised to be the power of number of digits
        int result=0;
        temp=num;

        while (temp>0) {
            int digit=temp%10;
            result+=Math.pow(digit, digits);
            temp=temp/10;
        }

        //checking the armstrong
        if(result==Original){
            System.out.println("Number is armstrong");
        }else{
            System.out.println("Number is not armstrong");
        }


        
    }
    
}
