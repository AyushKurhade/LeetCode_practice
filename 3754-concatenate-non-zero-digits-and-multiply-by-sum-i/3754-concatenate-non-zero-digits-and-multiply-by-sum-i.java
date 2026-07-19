class Solution {
    public long sumAndMultiply(int n) {
        int a = 0;
        int sum = 0;
        int temp = Math.abs(n);
        while(temp >0){
            int d = temp % 10;
            if( d !=0){

              sum = sum + d;

             a = (a * 10) + d;
                
            }
            temp = temp / 10;
        }
        String str = String.valueOf(a);

        String rev = new StringBuilder(str).reverse().toString();

        int revNum = Integer.parseInt(rev);

         long x = (long) revNum * sum ;


        return x;

    }
}