class Solution {
    public static void main(String[] args) {
        int res = nthFibonacci(17);
        System.out.println(res);
    }
    static int nthFibonacci(int n){
        // code here
        if(n>0 && n<=2){
            return n-1;
        }
        int ans = nthFibonacci(n-1)+nthFibonacci(n-2);
        return ans%1000000007;
    }
}

