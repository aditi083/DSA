import java.util.ArrayList;

class Solution {
    public static int[][] merge(int[][] intervals) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i<intervals.length-1; i++){
            if(intervals[i][1]>=intervals[i+1][0]){
                int a = intervals[i][0];
                int b = intervals[i+1][1];
                arr.add(a);
                arr.add(b);
            }else if(intervals[i][1]<intervals[i+1][0]){
                int a = intervals[i][0];
                int b = intervals[i][1];
                arr.add(a);
                arr.add(b);
            }
            ans.add(arr);
        }
        int[][] array = ans.stream()
                          .map(l -> l.stream()
                               .mapToInt(Integer::intValue)
                               .toArray()
                              )
                          .toArray(int[][]::new);
        return array;
    }

    public static void main(String[] args) {
        int[][] my = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result =merge(my);
        for (int i = 0; i < result.length; i++){
            for (int j = 0; j < result[i].length; j++){
                System.out.print(result[i][j] + " ");
            }
        }
    }
}