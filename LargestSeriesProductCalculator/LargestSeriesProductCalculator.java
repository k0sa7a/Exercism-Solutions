import java.util.*;

class LargestSeriesProductCalculator {
    int[] arrNum;
    long sum = 0;
    String str;

    LargestSeriesProductCalculator(String inputNumber) {


        str = inputNumber;
        if(str != ""){
            String[] arrStr = inputNumber.split("");
            for(int m = 0; m < arrStr.length; m ++){
                if(!arrStr[m].matches("[0-9]") && inputNumber != ""){
                    throw new IllegalArgumentException("String to search may only contain digits.");
                }
            }

            arrNum = new int[arrStr.length];
            for(int i = 0; i < arrStr.length; i ++){
                arrNum[i] = Integer.valueOf(arrStr[i]);
            }
        }
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {

        if(str == "" && numberOfDigits == 0){
            return 1;
        }

        if( (str == "" && numberOfDigits > 0) || (numberOfDigits > arrNum.length) ){
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        }

        if(numberOfDigits < 0){
            throw new IllegalArgumentException("Series length must be non-negative.");
        }

        if(numberOfDigits == 0){
            return 1;
        }

        for(int i = 0; i <= arrNum.length - numberOfDigits; i ++){
            long valueToCheck = arrNum[i];
            for(int j = i+1; j < i + numberOfDigits; j++){
                valueToCheck *= arrNum[j];
           }
            if(sum < valueToCheck){
                sum = valueToCheck;
            }
        }





        return sum;
    }
}
