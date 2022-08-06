import java.util.*;

class NucleotideCounter {
    String allowedElements = "ACGT";
    HashMap<Character, Integer> map = new HashMap<>();
    String[] inputArr;

        public NucleotideCounter(String input){
            inputArr = input.split("");
            for(String element : inputArr){
                if(!allowedElements.contains(element)){
                    throw new IllegalArgumentException();
                }
            }
            map.put('A', 0);
            map.put('C', 0);
            map.put('G', 0);
            map.put('T', 0);
    }

        public HashMap nucleotideCounts(){
            for(String element : inputArr){
                if(element.equals("A")){
                    map.put('A', map.get('A') + 1);
                } else if (element.equals("C")){
                    map.put('C', map.get('C') + 1);
                } else if(element.equals("G")){
                    map.put('G', map.get('G') + 1);
                } else if(element.equals("T")){
                    map.put('T', map.get('T') + 1);
                }
            }
            return map;
    }

}
