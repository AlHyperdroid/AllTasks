package collections;

import java.util.SortedMap;

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

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(arr, 0, newArray, 0, pointer);
        arr = newArray;
    }

    public int arraySize(){
        return pointer;
    }

    public void delete (int index){
        for (int i = index; i < pointer; i++){
            arr[i] = arr[i+1];
            arr[pointer] = null;
            pointer--;
        }
    }

    public void printer() {
        System.out.println("Content of List : ");
        for (int i = 0; i < pointer; i++) {
            System.out.println(arr[i].toString());
        }
    }

    public void arrListIsEmpty(){
        if (pointer == 0){
            System.out.println("array is empty");
        }else {
            System.out.println("array have: " + arraySize() + " elements");
        }
    }


    public static void main(String[] args) {
        NewArrayList ar = new NewArrayList();
        ar.add("First");
        ar.add("Second");
        ar.add("Third");
        ar.add("Fourth");
        ar.add("Fifth");
        ar.add("Sixth");
        ar.add("Seventh");
        ar.add("Eighth");
        ar.add("Ninth");
        ar.add("Tenth");
        ar.add("Eleventh");
        ar.printer();
        System.out.println("");
        System.out.println(ar.arraySize());
        System.out.println("");
        ar.arrListIsEmpty();
        System.out.println("");
        System.out.println(ar.getElement(1));
    }
}
