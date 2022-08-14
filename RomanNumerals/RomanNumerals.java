import java.util.*;

class RomanNumerals {
    String romanizedNumber = "";
    int originalNum;
    List<Integer> digits = new ArrayList<Integer>();


    public RomanNumerals(int number){
        originalNum = number;
        while (number > 0) {
            int digit = number % 10;
            number = number/10;
            digits.add(digit);
        }
        Collections.reverse(digits);

        romanizedNumber = this.romanize(originalNum);
    }

    public String getRomanNumeral(){
        return romanizedNumber;
    }

    public String romanize(int num){
        int val;
        if(num > 999){
            int thousands = digits.get(0);
            for(int i =0; i < thousands; i++){
                romanizedNumber += "M";
            }
        }

        if(digits.size() >= 3 && digits.get(digits.size()-3) != 0){
            val = digits.get(digits.size()-3);
            if(val <= 3){
                for(int i = 0; i < val; i++ ){
                    romanizedNumber += "C";
                }
            } else if(val == 4){
                romanizedNumber += "CD";
            } else if(val >= 5 && val < 9){
                romanizedNumber += "D";
                for(int i = 0; i < val - 5; i++ ){
                    romanizedNumber += "C";
                }
            } else if (val == 9){
                    romanizedNumber += "CM";
            }
        }

        if(digits.size() >= 2 && digits.get(digits.size()-2) != 0){
            val = digits.get(digits.size()-2);
            if(val <= 3){
                for(int i = 0; i < val; i++ ){
                    romanizedNumber += "X";
                }
            } else if(val == 4){
                romanizedNumber += "XL";
            } else if(val >= 5 && val < 9){
                romanizedNumber += "L";
                for(int i = 0; i < val - 5; i++ ){
                    romanizedNumber += "X";
                }
            } else if (val == 9){
                    romanizedNumber += "XC";
            }
        }

        if(digits.size() >= 1 && digits.get(digits.size()-1) != 0){
            switch (digits.get(digits.size()-1)){
                case 9:
                    romanizedNumber += "IX";
                    break;
                case 8:
                    romanizedNumber += "VIII";
                    break;
                case 7:
                    romanizedNumber += "VII";
                    break;
                case 6:
                    romanizedNumber += "VI";
                    break;
                case 5:
                    romanizedNumber += "V";
                    break;
                case 4:
                    romanizedNumber += "IV";
                    break;
                case 3:
                    romanizedNumber += "III";
                    break;
                case 2:
                    romanizedNumber += "II";
                    break;
                case 1:
                    romanizedNumber += "I";
            }
        }

        return romanizedNumber;
    }

}
