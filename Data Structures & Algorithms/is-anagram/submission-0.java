
class Solution {
    public boolean isAnagram(String s, String t) {
        int m= s.length();
        int n= t.length();
        if(m!=n){
           return false;
        }
        // convert krege Array me
        char [] sArr= s.toCharArray();
        char [] tArr= t.toCharArray();

        // sort krenege
        java.util.Arrays.sort(sArr);
        java.util.Arrays.sort(tArr);

        // equality check
       return java.util.Arrays.equals(sArr, tArr);
    }
}
