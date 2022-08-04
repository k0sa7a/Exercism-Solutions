import java.util.*;

class TwelveDays {
    ArrayList<String> songArr = new ArrayList<String>();
    String one = "On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.\n";
    String two = "On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.\n";
    String three = "On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
    String four = "On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
    String five = "On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
    String six = "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
    String seven = "On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
    String eight = "On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
    String nine = "On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
    String ten = "On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
    String eleven = "On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
    String twelve = "On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";

    public TwelveDays(){
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

    String verse(int verseNumber) {
        return songArr.get(verseNumber - 1);
    }

    String verses(int startVerse, int endVerse) {
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

    String sing() {
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
