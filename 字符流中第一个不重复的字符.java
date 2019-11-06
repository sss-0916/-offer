public class Solution {
    private StringBuilder str = new StringBuilder();
    private int[] hashTable = new int[128];
    
    //Insert one char from stringstream
    public void Insert(char ch) {
        str.append(ch);
        ++hashTable[ch];
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        int length = str.length();
        for (int i = 0; i < length; ++i) {
            char ch = str.charAt(i);
            if (hashTable[ch] == 1) {
                return ch;
            }
        }
        
        return '#';
    }
}