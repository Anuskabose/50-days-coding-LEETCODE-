class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0; // i for long String
        int j = 0; // j for short String
        while(i < t.length() && j < s.length()){
            if(t.charAt(i) == s.charAt(j)) j++; // move short pointer
            i++; // no matter above condition true or false move long pointer
        }
        return j==s.length(); // returns true if it matches else false
    }
}
