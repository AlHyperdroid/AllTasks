package io_task;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class CountWords {

    public static void prepositionCounter() throws IOException {   //Подсчет предлогов в файле
        String word1 = "там";
        String word2 = "о";
        String word3 = "в";
        String word4 = "и";
        String word5 = "на";
        String word6 = "по";

        File file = new File("C:(path)\\Luckmore.txt");
        Scanner sc = new Scanner(new FileInputStream(file));
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        int counter6 = 0;

        int counterUltra = 0;

        while (sc.hasNext()) {
            String str = sc.next();
            if (str.equals(word1)) counter1++;
            if (str.equals(word2)) counter2++;
            if (str.equals(word3)) counter3++;
            if (str.equals(word4)) counter4++;
            if (str.equals(word5)) counter5++;
            if (str.equals(word6)) counter6++;

            if (str.equals(word1)||str.equals(word2)||
                    str.equals(word3)||str.equals(word4)||
                    str.equals(word5)||str.equals(word6)) counterUltra++;
        }

        System.out.println("Number of words: 'там' " + counter1 + "\n" +
                "Number of words: 'о' " + counter2 + "\n" +
                "Number of words: 'в' " + counter3 + "\n" +
                "Number of words: 'и' " + counter4 + "\n" +
                "Number of words: 'на' " + counter5 + "\n" +
                "Number of words: 'по' " + counter6);

        System.out.println("Всего предлогов: " + counterUltra);
    }
}
