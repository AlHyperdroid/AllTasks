package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public abstract class MyOwnCollection <E> implements Collection<E> {

    public static Collection createMyCollection() {
        Collection collect = new ArrayList();
        collect.add("First element");
        collect.add("Second element");
        collect.add("Third element");
        collect.add("Fourth element");
        collect.add("Fifth element");
        return collect;
    }

    public static Collection createSecondCollection() {
        Collection collecttwo = new ArrayList();
        return collecttwo;
    }

    public static void main(String[] args) {
        Collection col = createMyCollection();
        for (Object o : col) {
            System.out.println(o);
        }

        col.remove("Second element");
        System.out.println();
        for (Object o : col) {
            System.out.println(o);
        }

        Collection coltwo = createSecondCollection();
        coltwo.addAll(col);
        System.out.println();
        for (Object o : coltwo) {
            System.out.println(o);
        }
    }
}

