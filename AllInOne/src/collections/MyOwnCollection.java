package collections;

import java.util.ArrayList;
import java.util.Collection;


public abstract class MyOwnCollection <E> implements Collection<E> {

public static Collection createMyCollection(){
    Collection collect = new ArrayList();
    collect.add("First element");
    collect.add("Second element");
    collect.add("Third element");
    collect.add("Fourth element");
    collect.add("Fifth element");
    return collect;
}

public static void main(String[] args) {
    Collection col = createMyCollection();
    for(Object o : col){
        System.out.println(o);
    }
    }
}
