import java.util.ArrayList;
import java.util.List;

public class Anagram {
    String word;

    public Anagram(String inputWord) {
        word = inputWord;
    }

    public List match(List list) {
        List result = new ArrayList<String>();
        for(Object listItem : list) {
            String listWord = listItem.toString();
            boolean correct = false;
            for(int i = 0; i < word.length(); i ++) {
                char letter = Character.toUpperCase(word.charAt(i));
                long wordLetterCount = 0;
                long listWordLetterCount = 0;
                wordLetterCount = word.toUpperCase().chars().filter(ch -> ch == letter).count();
                listWordLetterCount = listWord.toUpperCase().chars().filter(ch -> ch == letter).count();
                if(wordLetterCount == listWordLetterCount) {
                    correct = true;
                } else {
                    correct = false;
                    break;
                }
            }
            if (correct == true && !listWord.toUpperCase().contains((word.toUpperCase()))) {
                result.add(listWord);
            }
        }
        return result;
    }

}
