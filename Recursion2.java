import java.util.ArrayList;

public class Recursion2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,6,5};
        // System.out.println(find(arr, 14, 0));
        // int ind = findIndex(arr, 5, 0);
        // System.out.println(ind);
        System.out.println(findAllIndex(arr, 6, 0));
    }

    static boolean sortted(int[] arr, int index){
        if(index==arr.length-1){
            return true;
        }

        return arr[index]<arr[index+1] && sortted(arr, index+1);
    }

    static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || find(arr, target, index+1);
    }

    static int findIndex(int[] arr, int target, int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return findIndex(arr, target, index+1);
        }
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> answerFromBelowCalls = findAllIndex(arr, target, index+1);
        list.addAll(answerFromBelowCalls);

        return list;
    }

}
