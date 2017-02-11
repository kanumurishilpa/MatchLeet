import java.util.*;
/**
 * Created by shilpakanumuri on 2/11/17.
 */
public class MatchWords {

    TreeMap<Character, Character> missMatchPairs;

    public boolean perfectMatch(String firstWord, String secondWord) {
        return (firstWord.equalsIgnoreCase(secondWord));
    }

    public boolean matchBySize(String firstWord, String secondWord) {
        return (firstWord.length() == secondWord.length());
    }

    public boolean firstCharMatcher(String firstWord, String SecondWord) {
        return firstWord.charAt(0) == SecondWord.charAt(0);
    }

    public boolean singleCharMismatch(String first, String second) {
        char[] firstArr = first.toCharArray();
        char[] secondArr = second.toCharArray();
        int counter = 0;
        missMatchPairs = new TreeMap<Character, Character>();
        for (int i = 1; i < firstArr.length; i++) {
            if ((firstArr[i] != secondArr[i])) {
                if (charMisMatch(firstArr[i], secondArr[i]))
                    counter++;
            }
        }
        return (counter == 0);
    }

    public boolean charMisMatch(Character first, Character second) {
        if (missMatchPairs.containsKey(first)) {
            if (second != missMatchPairs.get(first)) {
                return true;
            }
        } else {
                missMatchPairs.put(first, second);
        }
        return false;
    }
}
