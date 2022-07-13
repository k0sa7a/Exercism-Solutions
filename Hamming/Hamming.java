import java.lang.Exception;

public class Hamming {
    String[] strandOne;
    String[] strandTwo;

    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() == 0 && rightStrand.length() != 0){
            throw new IllegalArgumentException ("left strand must not be empty.");
        } else if (leftStrand.length() != 0 && rightStrand.length() == 0) {
            throw new IllegalArgumentException ("right strand must not be empty.");
        } else if (leftStrand.length() != rightStrand.length()){
            throw new IllegalArgumentException ("leftStrand and rightStrand must be of equal length.");
        } else {
            this.strandOne = (leftStrand == "" || leftStrand == null) ? new String[0] : leftStrand.split("");
            this.strandTwo = (rightStrand == "" || rightStrand == null) ? new String[0] : rightStrand.split("");
        }
    }

    public int getHammingDistance() {
        int difference = 0;
        for(int i = 0; i < strandOne.length; i++)
            if (!strandOne[i].equals(strandTwo[i])){
                difference += 1;
            }
        return difference;
    }

}
