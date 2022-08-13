import java.util.*;

public class Knapsack {


    public int maximumValue(int limit, List<Item> itemsList){
        int result = 0;

        if(limit == 0 || itemsList.size() == 0){
            return 0;
        }

        for(int i = 0; i < itemsList.size(); i++ ){
            Item currentItem = itemsList.get(i);

            if(itemsList.get(i).weight > limit){
                continue;
            } else {
                int value = 0;
                value += currentItem.value;
                List<Item> itemsListCopy = new ArrayList<Item>(itemsList);
                itemsListCopy.remove(currentItem);
                value += this.maximumValue(limit - currentItem.weight, itemsListCopy);
                result = Math.max(result, value);
            }
        }
        return result;
    }

}

class Item {
    int weight;
    int value;
   public Item(int w, int v){
        this.weight = w;
        this.value = v;
    }
}
