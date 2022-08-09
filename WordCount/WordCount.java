import java.util.*;

class WordCount {
    HashMap<String, Integer> map = new HashMap<String, Integer>();

    public HashMap phrase(String sentence){
        sentence = sentence.replaceAll("[!&@$%^&:.]", "");
        sentence = sentence.replaceAll(",", " ");
        sentence = sentence.replaceAll("[\t\n]", " ");
        String[] arr = sentence.split(" ");


        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i].toLowerCase().trim();
            if(arr[i] == " " || arr[i] == ""){
                continue;
            }
            if(arr[i].charAt(0) == '\''){
                arr[i] = arr[i].substring(1, arr[i].length() -1);
            }
            if(map.get(arr[i]) == null) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        return map;
    }
}
