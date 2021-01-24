package io_task;

import java.io.File;

public class PrintDirectoryFiles {

    public static void printDirectoryFiles() {  //Получение файлов и папок внутри папки src
        File dir = new File("AllInOne/src");
        for (File item : dir.listFiles()) {
            if (item.isDirectory()) {
                System.out.println(item.getName() + " папка");
            } else {
                System.out.println(item.getName() + " файл");
            }

        /*File dirm = new File("IOTSK/src/filepath");
            for (File items : dirm.listFiles()) {
                if (item.isDirectory()) {
                    System.out.println(items.getName());
                } else {
                    System.out.println(items.getName());
                    }
                }
         */
        }


    }
}
