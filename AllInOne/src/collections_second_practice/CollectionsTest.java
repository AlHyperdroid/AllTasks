package collections_second_practice;

import java.util.*;

public class CollectionsTest {

    public static String arrayListTest() {
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add(0, "1");
        numbers.add(1, "2");
        numbers.add(2, "3");
        numbers.add(3, "4");
        numbers.add(4, "5");

        System.out.printf("ArrayList has %d elements \n", numbers.size());

        Object[] numbersArray = numbers.toArray();
        for (Object number : numbersArray) {
           System.out.println(number);
        }
        return null;
    }


    public static void mapTest(){

        Map<Integer, String> numbers = new HashMap<Integer, String>();
        numbers.put(0, "1");
        numbers.put(1, "2");
        numbers.put(3, "3");
        numbers.put(4, "4");
        numbers.put(5, "5");

        System.out.println("Map of numbers: " + numbers);
    }


        public static void hashTableTest() {
            // Создаёт хэш-карту
            Hashtable balance = new Hashtable();
            Enumeration names;
            String str;
            double bal;

            balance.put("Маша", 3434.34);
            balance.put("Михаил", 123.22);
            balance.put("Олег", 1378.00);
            balance.put("Денис", 99.22);
            balance.put("Антон", -19.08);


            // Показывает все балансы в хэш-таблицы.
            names = balance.keys();

            while(names.hasMoreElements()) {
                str = (String) names.nextElement();
                System.out.println(str + ": " + balance.get(str));
            }
            System.out.println();

            // Вносим 1,000 в аккаунт Маши.
            bal = ((Double)balance.get("Маша")).doubleValue();
            balance.put("Маша", (bal + 1000));
            System.out.println("Новый баланс Маши: " + balance.get("Маша"));

        }
    private int hash(String key)
    {
        int hash = 0;
        int size = 20;
        for(int i = 0; i < key.length(); i++)
            hash = (31 * hash + key.charAt(i)) % size;

        return hash;
    }

    public static void main(String[] args) {
        arrayListTest();
        mapTest();
        hashTableTest();
    }
}
