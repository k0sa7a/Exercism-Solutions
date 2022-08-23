import java.util.*;

class BinarySearch{
    List<Integer> values;

    public BinarySearch(List<Integer> values){
        this.values = values;
    }

    public int indexOf(int number) throws ValueNotFoundException {
        int low = 0;
        int high = values.size() - 1;
        while(low <= high){
            int mid = (low + high)/2;
                if(number == values.get(mid) ){
                    return mid;
                }

                if(number > values.get(mid)){
                    low = mid + 1;
                }

                if(number < values.get(mid)) {
                    high = mid - 1;
                }
        }
        throw new ValueNotFoundException("Value not in array");
    }
}
