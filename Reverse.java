public class Reverse {
    public static void main(String[] args) {
        int num=123;
        int LastDigit=0;
        int ReverseNum=0;

        while (num>0) {
            
        
        LastDigit=num%10;
        ReverseNum=ReverseNum*10+LastDigit;
        num=num/10;
        }
        System.out.println(ReverseNum);
        
    }
    
    
    
}

