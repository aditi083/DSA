public class OrderAgnosticBinary {
    public static void main(String[] args) {
        int[] arr = {56,34,22,19,12,8,2,0};
        int ans = binarysearch(arr, 0);
        System.out.println(ans);       
    }

    static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid + 1;
                }
            } 
            else {
                if(target < arr[mid]){
                    start = mid+1;
                } 
                else{
                    end = mid - 1;
                }
            }
            
        }
        return -1;
    }
}
