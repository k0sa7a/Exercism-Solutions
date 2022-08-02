import java.util.*;

public class BowlingGame {
    int finalScore = 0;
    ArrayList<Integer> gameScores = new ArrayList<Integer>();
    boolean spare;
    boolean strike;
    boolean strikeOne;
    boolean strikeTwo;



    public void roll(int pins){
        if(pins < 0){
            throw new IllegalStateException("Negative roll is invalid");
        }

        if(gameScores.size() >= 22){
            throw new IllegalStateException("Cannot roll after game is over");
        }

        if(gameScores.size() == 20 && (gameScores.get(gameScores.size()-1) + gameScores.get(gameScores.size()-2) < 10)){
            throw new IllegalStateException("Cannot roll after game is over");
        }

        if(gameScores.size() == 21 && (gameScores.get(gameScores.size()-2) + gameScores.get(gameScores.size()-3) == 10) && (gameScores.get(gameScores.size()-2) != 10))  {
            throw new IllegalStateException("Cannot roll after game is over");
        }



        if(pins > 10){
            throw new IllegalStateException("Pin count exceeds pins on the lane");
        }


        if (((gameScores.size() % 2 != 0 && ((pins + gameScores.get(gameScores.size()-1)) > 10)) || pins > 10) && (strikeOne != true && strikeTwo !=true)){
             throw new IllegalStateException("Pin count exceeds pins on the lane");
        }

        if(spare == true){
            gameScores.set(gameScores.size()-1, (gameScores.get(gameScores.size()-1) + pins));
            spare = false;
        }

        if(gameScores.size() % 2 != 0 && (pins + gameScores.get(gameScores.size()-1) == 10 && gameScores.size() != 19)){
            spare = true;
            }



        if(strikeTwo == true){
            gameScores.set(gameScores.size()-2, (gameScores.get(gameScores.size()-2) + pins));
            strikeTwo = false;
        }


            if(strikeOne == true){
                gameScores.add(gameScores.size()-1, 0);
                if(gameScores.size() < 20 ){
                    gameScores.set(gameScores.size()-1, (gameScores.get(gameScores.size()-1) + pins));
                    strikeOne = false;
                    strikeTwo = true;
                } else {
                    strikeOne = false;
                }

        }

        if(gameScores.size() % 2 == 0 && pins == 10){
            strikeOne = true;
        }

        gameScores.add(pins);









    }

    public int score() {

        if(gameScores.size() < 20){
            throw new IllegalStateException("Score cannot be taken until the end of the game");
        }

        if(gameScores.size() == 21 && (gameScores.get(gameScores.size()-2) == 10)  ){
            throw new IllegalStateException("Score cannot be taken until the end of the game");
        }

        for(int currentRoundScore : gameScores){
            finalScore += currentRoundScore;
        }

        if(gameScores.size() == 20 && ((gameScores.get(gameScores.size()-1) + gameScores.get(gameScores.size()-2)) == 10)){
            throw new IllegalStateException("Score cannot be taken until the end of the game");
        }
        return finalScore ;



    }
}
