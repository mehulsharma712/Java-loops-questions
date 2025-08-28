public class Rotation {
    public static void main(String[] args) {
        int num=12345;
        int r=2;
        

        int div=(int)Math.pow(10,r );
        int left=num/div;
        int copy=left;
        int right=num%div;

        int leftcount=0;

        while(left>0){
            left=left/div;
        }

        left=copy;

        int result=right*(int)Math.pow(10, leftcount)+left;
        System.out.println(result);




    }
    
}
