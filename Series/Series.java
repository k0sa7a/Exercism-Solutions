import java.util.*;

class Series {
    String numbers;
    String[] arr;
    ArrayList<String> result = new ArrayList<String>();

    public Series(String input){
        numbers = input;
        arr = input.split("");

    }

    public ArrayList<String> slices(int steps){
        if(steps <= 0){
            throw new IllegalArgumentException("Slice size is too small.");
        } else if (steps > numbers.length()){
            throw new IllegalArgumentException("Slice size is too big.");
        }

        for(int i = 0; i <= numbers.length() - steps; i++){
            String step = arr[i];
            for(int j = i+1; j < i + steps; j ++){
                step += arr[j];
            }
            result.add(step);
        }

        return result;
    }

}
