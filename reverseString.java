public class reverseString {
    public static void main(String[] args) {
        String s = " hello world ";
        String ans = reverseWords(s);
        System.out.println(ans);
    }
    
    static String reverseWords(String s) {
        String[] ans = null;
        int start = 0;
        ans = s.split(" ");
        int end = ans.length-1;
        while(start<=end){
            String temp = ans[start];
            ans[start] = ans[end];
            ans[end] = temp;
            start++;
            end--;
        }
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < ans.length-1; i++) {
                if(ans[i] != " "){
                    sb.append(ans[i]);
                }
                sb.append(" ");
            }
            sb.append(ans[ans.length-1]);
            String str = sb.toString();
            return str;
    }
}
