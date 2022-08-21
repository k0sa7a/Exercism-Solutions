import java.util.*;

public class DoublyLinkedList<T> {
    ArrayList<T> testList = new ArrayList<T>();

    public void push(T value){
        testList.add(value);
    }

    public T pop() {
        ArrayList<T> resultList = new ArrayList<T>();
        T value = testList.get(testList.size() - 1);

        for(int i = 0; i < testList.size(); i++){
            if(i != testList.size() - 1){
                resultList.add(testList.get(i));
            }
        }

        testList = resultList;
        return value;

    }

    public T shift() {
        ArrayList<T> resultList = new ArrayList<T>();
        T value = testList.get(0);

        for(int i = 0; i < testList.size(); i++){
            if(i != 0){
                resultList.add(testList.get(i));
            }
        }

        testList = resultList;
        return value;
    }

    public void unshift(T value) {
        ArrayList<T> resultList = new ArrayList<T>();
        resultList.add(value);

        for(int i = 0; i < testList.size(); i++){
            resultList.add(testList.get(i));
        }

        testList = resultList;
    }
}
