import java.util.*;
public class Flattener {

    public List flatten(List list){
       return this.flattenList(list);
    }

    List<Object> flattenList (Object obj){
        List<Object> result = new ArrayList<Object>();

        if(obj != null && obj instanceof List) {
            for(Object element : (List<?>) obj) {
                result.addAll(flattenList(element));
            }
        } else if (obj != null && !(obj instanceof List)) {
            result.add(obj);
        }
        return result;
    }
}
