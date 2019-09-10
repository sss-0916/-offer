public class Solution {
    public int RectCover(int target) {
        if(target == 1){
            return 1;
        }
        
        if(target == 2){
            return 2;
        }
        
        int result = 0;
        int n1 = 2;
        int n2 = 1;
        for(int i = 3; i <= target; ++i){
            result = n1 + n2;
            n2 = n1;
            n1 = result;
        }
        
        return result;
    }
}