class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        boolean[][] dp=new boolean[s.length()][s.length()];
        for (int end=0;end<s.length();end++) {
            for (int start=0;start<=end;start++) {
                if (s.charAt(start)==s.charAt(end) && (end-start<=2 || dp[start+1][end-1])) {
                    dp[start][end] = true;
                    if (end-start+1>ans.length()) {
                        ans=s.substring(start,end+1);
                    }
                }
            }
        }
        return ans;
    }
}
