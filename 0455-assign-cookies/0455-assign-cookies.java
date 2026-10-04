class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0,cookieIndex=0;
        int n=g.length;
        int m=s.length;
        for(int i=0;i<n;i++){
            while(cookieIndex<m && s[cookieIndex]<g[i]){
                cookieIndex++;
            }
            if (cookieIndex == m) {
                break;
        }
        count++;
        cookieIndex++;
        }
        return count;
    }
}