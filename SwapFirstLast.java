public class SwapFirstLast{

    public static void main(String args[]){
        int num=54321;
        int lastdigit=0;


        int count=0;

        while(num>0){
            num=num/10;
            count++;
        }
        int copy=num;

        int div=(int) Math.pow(10,count-1);

        int first=num/div;
        int mid=num%div;

        int r=lastdigit*(int) Math.pow(10,count)+ mid*10+first;
        System.out.println(r);




    }
}