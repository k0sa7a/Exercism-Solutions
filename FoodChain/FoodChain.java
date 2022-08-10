import java.util.*;

class FoodChain {
    ArrayList<String> songArr = new ArrayList<String>();
    String one = "I know an old lady who swallowed a fly.\n" +
                "I don't know why she swallowed the fly. Perhaps she'll die.";
    String two = "I know an old lady who swallowed a spider.\n" +
                "It wriggled and jiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly.\n" +
                "I don't know why she swallowed the fly. Perhaps she'll die.";
    String three = "I know an old lady who swallowed a bird.\n" +
                    "How absurd to swallow a bird!\n" +
                    "She swallowed the bird to catch the spider that wriggled and jiggled and " +
                    "tickled inside her.\n" +
                    "She swallowed the spider to catch the fly.\n" +
                    "I don't know why she swallowed the fly. Perhaps she'll die.";
    String four = "I know an old lady who swallowed a cat.\n" +
                    "Imagine that, to swallow a cat!\n" +
                    "She swallowed the cat to catch the bird.\n" +
                    "She swallowed the bird to catch the spider that wriggled and jiggled and " +
                    "tickled inside her.\n" +
                    "She swallowed the spider to catch the fly.\n" +
                    "I don't know why she swallowed the fly. Perhaps she'll die.";
    String five = "I know an old lady who swallowed a dog.\n" +
                    "What a hog, to swallow a dog!\n" +
                    "She swallowed the dog to catch the cat.\n" +
                    "She swallowed the cat to catch the bird.\n" +
                    "She swallowed the bird to catch the spider that wriggled and jiggled and " +
                    "tickled inside her.\n" +
                    "She swallowed the spider to catch the fly.\n" +
                    "I don't know why she swallowed the fly. Perhaps she'll die.";
    String six = "I know an old lady who swallowed a goat.\n" +
                    "Just opened her throat and swallowed a goat!\n" +
                    "She swallowed the goat to catch the dog.\n" +
                    "She swallowed the dog to catch the cat.\n" +
                    "She swallowed the cat to catch the bird.\n" +
                    "She swallowed the bird to catch the spider that wriggled and jiggled and " +
                    "tickled inside her.\n" +
                    "She swallowed the spider to catch the fly.\n" +
                    "I don't know why she swallowed the fly. Perhaps she'll die.";
    String seven = "I know an old lady who swallowed a cow.\n" +
                    "I don't know how she swallowed a cow!\n" +
                    "She swallowed the cow to catch the goat.\n" +
                    "She swallowed the goat to catch the dog.\n" +
                    "She swallowed the dog to catch the cat.\n" +
                    "She swallowed the cat to catch the bird.\n" +
                    "She swallowed the bird to catch the spider that wriggled and jiggled and " +
                    "tickled inside her.\n" +
                    "She swallowed the spider to catch the fly.\n" +
                    "I don't know why she swallowed the fly. Perhaps she'll die.";
    String eight = "I know an old lady who swallowed a horse.\n" +
                    "She's dead, of course!";


    public FoodChain(){
        songArr.add(one);
        songArr.add(two);
        songArr.add(three);
        songArr.add(four);
        songArr.add(five);
        songArr.add(six);
        songArr.add(seven);
        songArr.add(eight);

    }

    String verse(int verseNumber) {
        return songArr.get(verseNumber - 1);
    }

    String verses(int startVerse, int endVerse) {
        String result = "";
        for(int i = startVerse - 1; i < endVerse; i++){
            if (i < endVerse - 1){
                result += songArr.get(i);
                result += "\n" + "\n";
            }else {
                result += songArr.get(i);
            }

        }
        return result;
    }

}
