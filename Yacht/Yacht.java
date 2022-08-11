import java.util.*;
import java.util.HashMap;
import java.util.stream.*;

class Yacht {
    int scoreValue;
    List diceList;
    int[] dice;
    ArrayList<Integer> diceArrList = new ArrayList<Integer>();
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    Yacht(int[] dice, YachtCategory yachtCategory) {
        this.dice = dice;
        Integer[] diceInt = new Integer[5];
        for(int i = 0; i < dice.length; i++){
            diceInt[i] = Integer.valueOf(dice[i]);
            diceArrList.add(dice[i]);
        }
        diceList = Arrays.asList(diceInt);

        for(int i = 0; i < dice.length; i ++) {
            if(map.get(dice[i]) == null) {
                map.put(dice[i], 1);
            } else {
                map.put(dice[i], map.get(dice[i]) + 1);
            }
        }


        switch (yachtCategory) {
            case YACHT:
                this.checkYacht();
                break;
            case CHOICE:
                this.checkChoice();
                break;
            case BIG_STRAIGHT:
                this.checkBigStraight();
                break;
            case LITTLE_STRAIGHT:
                this.checkLittleStraight();
                break;
            case FOUR_OF_A_KIND:
                this.checkFourOfAKind();
                break;
            case FULL_HOUSE:
                this.checkFullHouse();
                break;
            case SIXES:
                this.checkNums(6);
                break;
            case FIVES:
                this.checkNums(5);
                break;
            case FOURS:
                this.checkNums(4);
                break;
            case THREES:
                this.checkNums(3);
                break;
            case TWOS:
                this.checkNums(2);
                break;
            case ONES:
                this.checkNums(1);
                break;
        }
    }

    int score() {
        return scoreValue;
    }

    public void checkYacht(){
        boolean sameValuesCheck = false;
        for(int i = 0; i < dice.length; i++){
            if(dice[i] == dice[0]){
                sameValuesCheck = true;
            } else {
                sameValuesCheck = false;
                break;
            }
        }
        scoreValue = sameValuesCheck == true ? 50 : 0;
    }

    public void checkChoice(){
        scoreValue = 0;
        for(int i = 0; i < dice.length; i ++){
            scoreValue += dice[i];
        }
    }

    public void checkBigStraight(){
        int[] values = {6, 5, 4, 3, 2};
        boolean checker = false;
        for(int i = 0; i < values.length; i++){
            if(diceList.contains(values[i])){
                checker = true;
            } else {
                checker = false;
                break;
            }
        }
        scoreValue = checker == true ? 30 : 0;
    }

    public void checkLittleStraight(){
        int[] values = {5, 4, 3, 2, 1};
        boolean checker = false;
        for(int i = 0; i < values.length; i++){
            if(diceList.contains(values[i])){
                checker = true;
            } else {
                checker = false;
                break;
            }
        }
        scoreValue = checker == true ? 30 : 0;
    }

    public void checkFourOfAKind(){
        if(map.get(6) != null && map.get(6) >= 4){
            scoreValue = 24;
        } else if(map.get(5) != null && map.get(5) >= 4) {
            scoreValue = 20;
        } else if(map.get(4) != null && map.get(4) >= 4) {
            scoreValue = 16;
        } else if(map.get(3) != null && map.get(3) >= 4) {
            scoreValue = 12;
        } else if(map.get(2) != null && map.get(2) >= 4) {
            scoreValue = 8;
        } else if(map.get(1) != null && map.get(1) >= 4) {
            scoreValue = 4;
        } else {
            scoreValue = 0;
        }
    }

    public void checkFullHouse(){
        if(map.get(6) != null && map.get(6) == 3){
            diceArrList.removeAll(Arrays.asList(6));
            if(diceArrList.get(0) == diceArrList.get(1)){
                scoreValue = IntStream.of(dice).sum();
            }
        } else if(map.get(5) != null && map.get(5) == 3) {
            diceArrList.removeAll(Arrays.asList(5));
            if(diceArrList.get(0) == diceArrList.get(1)){
                scoreValue = IntStream.of(dice).sum();
            }
        } else if(map.get(4) != null && map.get(4) == 3) {
            diceArrList.removeAll(Arrays.asList(4));
            if(diceArrList.get(0) == diceArrList.get(1)){
                scoreValue = IntStream.of(dice).sum();
            }
        } else if(map.get(3) != null && map.get(3) == 3) {
            diceArrList.removeAll(Arrays.asList(3));
            if(diceArrList.get(0) == diceArrList.get(1)){
                scoreValue = IntStream.of(dice).sum();
            }
        } else if(map.get(2) != null && map.get(2) == 3) {
            diceArrList.removeAll(Arrays.asList(2));
            if(diceArrList.get(0) == diceArrList.get(1)){
                scoreValue = IntStream.of(dice).sum();
            }
        } else if(map.get(1) != null && map.get(1) == 3) {
            diceArrList.removeAll(Arrays.asList(1));
            if(diceArrList.get(0) == diceArrList.get(1)){
                scoreValue = IntStream.of(dice).sum();
            }
        } else {
            scoreValue = 0;
        }
    }

    public void checkNums(int number){
        if(map.get(number) != null){
            int count = map.get(number);
            scoreValue = number * count;
        } else {
            scoreValue = 0;
        }
    }

}
