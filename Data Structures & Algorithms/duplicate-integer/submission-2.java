class Solution {
    public boolean hasDuplicate(int[] nums) {
       /* bruteforce that takes O(N^2)
        int n= nums.length;
        for ( int i= 0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i]==nums[j]){
                    return true;
                }
               
            }
        }
        return false;
        */

        // we eill use a hash set for optimal time

        HashSet<Integer> seen= new HashSet<> ();
        for( int num :nums){

            if(seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}