public class Patterns {
    public static void main(String[] args) {
        // pattern1(5);
        // pattern2(5);
        // pattern3(5);
        // pattern4(5);
        pattern31(4);
    }

    static void pattern1(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n-row+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int row=0; row<2*n; row++){
            int totaCols = row > n ? 2 * n - row: row;
            for(int col=0; col< totaCols; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for(int row=1; row<=n; row++){
            int spaces = n - row;
            for(int s=1; s<=spaces; s++){
                System.out.print(" ");
            }
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for(int row=1; row<=n; row++){
            int spaces = row-1;
            for(int s=1; s<=spaces; s++){
                System.out.print(" ");
            }
            for(int col=1; col<=n-row+1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern17(int n){
        for(int row = 1; row <= 2*n-1; row++){
            int c = row > n? 2*n-row: row;
            for(int s=0; s<n-c; s++){
                System.out.print(" ");
            }
            for(int col=c; col>=1; col--){
                System.out.print(col);
            }
            for(int col=2; col<=c; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern28(int n){
        for(int row=0; row<2*n; row++){
            int totaCols = row > n ? 2 * n - row: row;

            int noOfspaces = n - totaCols;
            for(int s = 0; s < noOfspaces; s++){
                System.out.print(" ");
            }
            for(int col=0; col< totaCols; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
        for(int row=1; row<=n; row++){
            for(int s=1; s<=n-row; s++){
                System.out.print("  ");
            }
            for(int col=row; col>=1; col--){
                System.out.print(col+" ");
            }
            for(int col=2; col<=row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern31(int n){
        for(int row=1; row<2*n-1; row++){
            for(int col=1; col<2*n-1; col++){
                int atEveryIndex = n - Math.min(Math.min(row-1,col-1),Math.min(2*n-row-2, 2*n-2-col));
                System.out.print(atEveryIndex);
            }
            System.out.println();
        }
    }
}
