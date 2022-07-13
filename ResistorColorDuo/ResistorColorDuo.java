import java.util.*;

class ResistorColorDuo {
    List<String> colorArr = new ArrayList<>(List.of("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"));

    int value(String[] colors) {
        String code = "";
        for(int i = 0 ; i < 2; i++){
            int val = colorArr.indexOf(colors[i]);
            code += val;
        }
        return Integer.parseInt(code);
    }
}
