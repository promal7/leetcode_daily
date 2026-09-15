class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashMap<Character, Integer> hmap=new HashMap<>();
        int len=0, maxlen=0;
        int l=0;
        for(int r=0; r<n; r++){
            hmap.put(s.charAt(r), hmap.getOrDefault(s.charAt(r), 0)+1);
            while(hmap.get(s.charAt(r))>1){
                hmap.put(s.charAt(l), hmap.get(s.charAt(l))-1);
                l++;
            }
            
            maxlen=Math.max(maxlen, r-l+1);
        }
        return maxlen;
    }
}