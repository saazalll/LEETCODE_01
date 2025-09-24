class Solution {
    public int fib(int n) {
        int ans = fibo(n);
        System.out.println(ans);
        return ans;

        }
    static int fibo(int n){
        //base condition
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }

}