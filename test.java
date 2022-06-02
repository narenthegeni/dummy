public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int repeatedNumber(final List<Integer> A) {
        
        for (int i=0; i < A.size(); i++) {
            for(int j=i+1; j < A.size(); j++) {
                if ( A.get(i) == A.get(j) ) {
                    return  A.get(j);
                }
            }
        }
        return 1;
    }
}
