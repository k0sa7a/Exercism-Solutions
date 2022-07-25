import java.util.ArrayList;

public class Robot {
    String name;
    static ArrayList<String> nameList = new ArrayList<String>();

    public Robot() {
        if(nameList.size() == 0) {
            name = nameARobot();
            nameList.add(name);
        } else {
            String placeholder = nameARobot();
            int currentSize = nameList.size();
            while (currentSize == nameList.size()){
            if(!nameList.contains(placeholder)){
                name = placeholder;
                nameList.add(placeholder);
            } else {
                placeholder = nameARobot();
            }
            }
        }
    }

    public String nameARobot() {
        String roboName = randomLetterStr() + randomLetterStr() + randomNumberStr() + randomNumberStr() + randomNumberStr();
        return roboName;
    }

    public String getName(){
        return this.name;
    }

    public void reset() {
        this.name = nameARobot();
    }

    public String randomLetterStr () {
        int ascii = (int)(Math.random() * (90 - 65 + 1)) + 65;
        char character = (char) ascii;
        return String.valueOf(character);
    }

    public String randomNumberStr () {
        return  Integer.toString((int)(Math.random()*10));
    }
}
