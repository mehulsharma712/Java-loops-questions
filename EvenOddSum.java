public class EvenOddSum{
    public static void main(String[] args) {
        int num= 12344332;
        int EvenSum=0;
        int OddSum=0;
        int position=1;  //we start from the right most digit

        while (num>0) {
            int digit=num%10;
            if(position%2==0){
                EvenSum+=digit;
            }else{
                OddSum+=digit;
            }
            num=num/10;
            position++;

        }
        System.out.println(EvenSum);
        System.out.println(OddSum);
        

    }
}