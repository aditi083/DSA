public class Recursion {
    public static void main(String[] args) {
        int fact = factorial(5);
        System.out.println(fact);
        int add = sum(10);
        System.out.println(add);

        int ans = sumOfDigit(1342);
        System.out.println(ans);

        int product = productOfDigit(1342);
        System.out.println(product);

        reverseNum1(12345);
        System.out.println();

        reverseNum2(54432);
        System.out.println(sum);

        int reverse = reverseNum3(1234, 4);
        System.out.println(reverse);

        int noOfZeroes = helper(300409);
        System.out.println(noOfZeroes);
    }

    static void print(int n){
        System.out.println(n);
        if(n == 5){
            return;
        }
        print(n+1);
    }
    
    static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }

    static int sumOfDigit(int n){
        if(n == 0){
            return 0;
        }
        return (n%10) + sumOfDigit(n/10);
    }

    static int productOfDigit(int n){
        if(n == 0){
            return 1;
        }
        return (n%10) * productOfDigit(n/10);
    }

    static void reverseNum1(int n){
        if(n == 0){
            return;
        }
        System.out.print(n%10);
        reverseNum1(n/10);
    }

    static int sum = 0;

    static void reverseNum2(int n){
        if(n == 0){
            return;
        }
        int rem = n%10;
        sum = sum * 10 + rem;
        reverseNum2(n/10);
    }

    static int reverseNum3(int n, int b){
        if(n == 0){
            return 0;
        }
        return (int) ((n%10)*Math.pow(10, b-1) + reverseNum3(n/10, b-1));
    }

    static int helper(int n){
        return countNoOfZeroes(n, 0);
    }

    static int countNoOfZeroes(int n, int c){
        if(n == 0){
            return c;
        }
        int rem = n%10;
        if(rem == 0){
            return countNoOfZeroes(n/10, c+1);
        }
       
        return countNoOfZeroes(n/10, c);
    }
}
