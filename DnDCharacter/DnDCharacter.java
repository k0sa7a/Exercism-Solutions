import static java.lang.Math.*;
import java.util.ArrayList;

class DnDCharacter {
    int str;
    int dex;
    int con;
    int intel;
    int wis;
    int cha;

    public DnDCharacter () {
        this.str = this.ability();
        this.dex = this.ability();
        this.con = this.ability();
        this.intel = this.ability();
        this.wis = this.ability();
        this.cha = this.ability();

    }

    int ability() {
            ArrayList<Integer> dice = new ArrayList<Integer>();
            dice.add((int)(random()*6) + 1);
            dice.add((int)(random()*6) + 1);
            dice.add((int)(random()*6) + 1);
            dice.add((int)(random()*6) + 1);

            int smallest = 7;
            for(int num : dice){
                if(num <= smallest){
                      smallest = num;
                      System.out.println(smallest);
                  }

            }
             dice.remove(Integer.valueOf(smallest));

            int sum = 0;
            for(int i = 0; i < dice.size(); i++){
                 sum += dice.get(i);
            }
            return sum;
        }

    int modifier(int input) {
        return (int)(Math.floor((input - 10.0)/2));
    }

    int getStrength() {
        return this.str;
    }

    int getDexterity() {
        return this.dex;
    }

    int getConstitution() {
        return this.con;
    }

    int getIntelligence() {
        return this.intel;
    }

    int getWisdom() {

        return this.wis;
    }

    int getCharisma() {
        return this.cha;
    }

    int getHitpoints() {
        return 10 + this.modifier(getConstitution());
    }

}
