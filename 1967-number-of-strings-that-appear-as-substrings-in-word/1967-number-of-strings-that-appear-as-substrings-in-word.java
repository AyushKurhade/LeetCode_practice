class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        int l = patterns.length;
        for(int i = 0; i < l ; i++){
            if(word.contains(patterns[i])){
                count++;
            }
        }
        return count;
    }
    
}