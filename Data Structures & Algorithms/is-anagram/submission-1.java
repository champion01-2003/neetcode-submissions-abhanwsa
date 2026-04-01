
class Solution {
    public boolean isAnagram(String s, String t) {
       //BruteForce time lega (NlogN)

        int m= s.length();
        int n= t.length();
        if(m!=n){
           return false;
        }
        /*
        // convert krege Array me
        char [] sArr= s.toCharArray();
        char [] tArr= t.toCharArray();

        // sort krenege
        java.util.Arrays.sort(sArr);
        java.util.Arrays.sort(tArr);

        // equality check
       return java.util.Arrays.equals(sArr, tArr);

       */

       //#### optimal approach by character frequecncy counter####
        
        int[] count = new int[26]; // Assuming lowercase a-z

         for (int i = 0; i < s.length(); i++) {
        count[s.charAt(i) - 'a']++; // Increment for string s
        count[t.charAt(i) - 'a']--; // Decrement for string t
        }

    // If it's an anagram, all values in the array should be 0
        for (int val : count) {
        if (val != 0) return false;
     }

     return true;



    }
}
