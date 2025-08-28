public class Palindrome {
    public static void main(String[] args) {
        int num=111;
        int Palindrome=0;
        int copy=num;

        while (num>0) {
            int LastDigit=num%10;
            Palindrome=Palindrome*10+LastDigit;
            num=num/10;
        }
        if(Palindrome==copy){
            System.out.println("number is palindrome");
        }else{
            System.out.println("Number is not palindrome");
        }
    }
    
}
