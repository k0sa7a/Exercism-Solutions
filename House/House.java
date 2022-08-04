import java.util.*;

public class House {
    ArrayList<String> songArr = new ArrayList<String>();
        String one = "This is the house that Jack built.";
        String two = "This is the malt that lay in the house that Jack built.";
        String three = "This is the rat that ate the malt that lay in the house that Jack built.";
        String four = "This is the cat that killed the rat that ate the malt that lay in the house that Jack built.";
        String five = "This is the dog that worried the cat that killed the rat that ate the malt that lay in the house that Jack built.";
        String six = "This is the cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt that lay in the house that Jack built.";
        String seven = "This is the maiden all forlorn that milked the cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt that lay in the house that Jack built.";
        String eight = "This is the man all tattered and torn that kissed the maiden all forlorn that milked the cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt that lay in the house that Jack built.";
        String nine = "This is the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked the cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt that lay in the house that Jack built.";
        String ten = "This is the rooster that crowed in the morn that woke the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked the cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt that lay in the house that Jack built.";
        String eleven = "This is the farmer sowing his corn that kept the rooster that crowed in the morn that woke the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked the cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt that lay in the house that Jack built.";
        String twelve = "This is the horse and the hound and the horn that belonged to the farmer sowing his corn that kept the rooster that crowed in the morn that woke the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked the cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt that lay in the house that Jack built.";

    public House() {
        songArr.add(one);
        songArr.add(two);
        songArr.add(three);
        songArr.add(four);
        songArr.add(five);
        songArr.add(six);
        songArr.add(seven);
        songArr.add(eight);
        songArr.add(nine);
        songArr.add(ten);
        songArr.add(eleven);
        songArr.add(twelve);
    }

    public String verse(int verseNumber) {
        return songArr.get(verseNumber - 1);
    }

    public String verses(int startVerse, int endVerse) {
        String result = "";
        for(int i = startVerse - 1; i < endVerse; i++){
            if (i < endVerse - 1){
                result += songArr.get(i);
                result += "\n";
            }else {
                result += songArr.get(i);
            }

        }
        return result;
    }

    public String sing(){
        String result = "";
        for(int i = 0; i < songArr.size(); i++){
            if (i < 11){
                result += songArr.get(i);
                result += "\n";
            }else {
                result += songArr.get(i);
            }

        }
        return result;
    }

}
