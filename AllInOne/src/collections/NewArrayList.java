package collections;
import java.util.Arrays;

public class NewArrayList<AR> {
    private int INIT_SIZE = 10;
    private final int CUT_RATE = 4;
    private Object[] arr = new Object[INIT_SIZE];
    private int pointer = 0;

    public void add(AR thing){
        if(pointer == arr.length-1)
            INIT_SIZE = INIT_SIZE * 2;


    }


}
