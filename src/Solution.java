import java.lang.reflect.Array;
import java.util.HashSet;

public class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> morseSet = new HashSet();
        for(String word : words){
            StringBuilder moreCode = new StringBuilder();
            for (char ch : word.toCharArray()){
                moreCode.append(MORSE[ch - 'a']);
            }
            morseSet.add(moreCode.toString());
        }
        return morseSet.size();
    }
}
