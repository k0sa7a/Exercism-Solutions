import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;

class RotationalCipher {
    HashMap<String, Integer> letterHash = new HashMap<String, Integer>();
    int changeValue;
    ArrayList<String> newArrList;



    RotationalCipher(int shiftKey) {
        // save integer of change that will be done as instance variable
        changeValue = shiftKey;
        int i = 0;
        for (char ch = 'A'; ch <= 'Z'; ++ch) {
            i+=1;
            letterHash.put(String.valueOf(ch), i);
        }
    }

    public String helper (int value) {
        String result = new String();
           for(Entry<String, Integer> entry : letterHash.entrySet()) {


      if(entry.getValue() == value) {
        result = entry.getKey();
        }

    }
        return result;
    }

    String rotate(String data) {
        // iterate over letters
        newArrList = new ArrayList<String>();
        String[] stringArr = data.split("");

        for(String str : stringArr){
            // determine if letter or other character
            if((str.charAt(0) >= 'a' && str.charAt(0) <= 'z') || (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z')){
                boolean upC = Character.isUpperCase(str.charAt(0)) ? true : false;
                int cipher = letterHash.get(str.toUpperCase());
            // if a letter get value of new letter based on shiftKey (from HashMap)
                int newCipher = (cipher + changeValue) > 26 ? (cipher + changeValue - 26) : (cipher + changeValue);
            // make sure upcase or downcase is kept isUpperCase(val)
                String newLet = upC ? helper(newCipher).toUpperCase() : helper(newCipher).toLowerCase() ;
                newArrList.add(newLet);
            }  else {
            // if other character do nothing to change it
                newArrList.add(str);
            }
        }

        String result = String.join("", newArrList);
        return result;
    }

}
