import java.util.*;

class DiamondPrinter {
    List<String> result;
    HashMap<Character, Integer> map;

    public DiamondPrinter(){
        result = new ArrayList<String>();
        map = new HashMap<Character, Integer>();
        int i = 1;

        for (char ch = 'A'; ch <= 'Z'; ch++){
            map.put(ch, i);
            i ++;
        }
    }

    List<String> printToList(char input) {
        int sizeNumber = map.get(input);
        for(char ch = 'A'; ch <= input; ch++){
            String[] line = new String[sizeNumber * 2 - 1];
            Arrays.fill(line, " ");
            line[sizeNumber - map.get(ch)] = String.valueOf(ch);
            line[sizeNumber * 2 - (sizeNumber - map.get(ch) + 2)] = String.valueOf(ch);
            result.add(String.join("", line));
        }

        for(char ch = --input; ch >= 'A'; ch--){
            String[] line = new String[sizeNumber * 2 - 1];
            Arrays.fill(line, " ");
            line[sizeNumber - map.get(ch)] = String.valueOf(ch);
            line[sizeNumber * 2 - (sizeNumber - map.get(ch) + 2)] = String.valueOf(ch);
            result.add(String.join("", line));
        }
        return result;
    }

}
