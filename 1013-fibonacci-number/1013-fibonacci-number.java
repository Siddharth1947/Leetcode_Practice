class Solution {
    public int fib(int n) {
        // if(n == 0) return 0;
        // if(n == 1) return 1;
        // int a = 0;
        // int b = 1;
        // int c= 0;
        // while(n>1){
        //      c = b+a;            
        //     a = b;
        //     b = c;
        //     n--;
        // }
        // return c;
        if(n == 0 || n == 1) return n;
        return fib(n-1)+fib(n-2);

        
    }
}