public class Frequency {
    public static void main(String[] args) {
        int num=11223344;
        int freq[]=new int[10];

        while (num>0) {
            int digit=num%10;
            num=num/10;
            freq[digit]++;
        }
        for(int i=0;i<=9;i++){
            System.out.println("Frequency of"+i+"is"+freq[i]);
        }

    



    }    
}
