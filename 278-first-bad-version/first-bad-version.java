/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 1 , h = n;
        int ans = -1;
        while(l<=h){
            int mid = l+(h-l)/2;
            boolean m = isBadVersion(mid);
            if(m==true){
                ans = mid;
                h = mid-1;
            }
            else {
                l = mid+1;
            }
        
        }
        return ans;
    }
}