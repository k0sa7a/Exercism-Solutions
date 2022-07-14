import java.util.List;
import java.util.Scanner;
import java.util.regex.*;
import java.util.stream.Collectors;
import java.util.ArrayList;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        List<String> result = new ArrayList<String>();
        List<String> list = new Scanner(rnaSequence).findAll("...").map(MatchResult::group).collect(Collectors.toList());


        for (String str : list) {
            boolean end = false;
            switch (str) {
                case "AUG" :
                    result.add("Methionine");
                    break;
                case "UUU" : case "UUC" :
                    result.add("Phenylalanine");
                    break;
                case "UUA" : case "UUG" :
                    result.add("Leucine");
                    break;
                case "UCU" : case "UCC" : case "UCA" : case "UCG" :
                    result.add("Serine");
                    break;
                case "UAU" : case "UAC" :
                    result.add("Tyrosine");
                    break;
                case "UGU" : case "UGC" :
                    result.add("Cysteine");
                    break;
                case "UGG" :
                    result.add("Tryptophan");
                    break;
                case "UAA" : case "UAG" : case "UGA" :
                    end = true;
                    break;
            }
            if (end == true) {
               return result;
            }
        }
        return result;
    }
}
