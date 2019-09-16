public class Solution {
    public void reOrderArray(int [] array) {
        int[] temp = new int[array.length];
        int index = 0;
        
        for(int i = 0; i < array.length; ++i){
            if(array[i] % 2 == 1){
                temp[index++] = array[i];
            }
        }
        
        for(int i = 0; i < array.length; ++i){
            if(array[i] % 2 == 0){
                temp[index++] = array[i];
            }
        }
        
        for(int i = 0; i < array.length; ++i){
            array[i] = temp[i];
        }
    }
}