import java.util.*;

class ResistorColor {
    List<String> colorArr = new ArrayList<>(List.of("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"));

    int colorCode(String color) {
        return colorArr.indexOf(color);
    }

    String[] colors() {
        String[] array = colorArr.toArray(new String[colorArr.size()]);
        return array;
    }
}
