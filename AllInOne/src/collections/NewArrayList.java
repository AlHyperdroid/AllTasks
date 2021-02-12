package collections;
import java.util.Arrays;

public class NewArrayList<AR> {
    private int INIT_SIZE = 10;
    private final int CUT_RATE = 4;
    private Object[] arr = new Object[INIT_SIZE];
    private int pointer = 0;


    public void add(AR thing){
        if(pointer == arr.length-1)
            resize(arr.length * 2);
        arr[pointer++] = thing;
    }

    public AR getElement (int index){
        return (AR) arr[index];
    }

    public int arraySize(){
        return pointer;
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(arr, 0, newArray, 0, pointer);
        arr = newArray;
    }

    public void delete (int index){
        for (int i = index; i < pointer; i++){
            arr[i] = arr[i+1];
            arr[pointer] = null;
            pointer--;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        NewArrayList ar = new NewArrayList();
        ar.add("1");
        ar.add("2");

    }
}
