package io_task;

import java.io.File;

public class PrintProjectPath {

    public static void projectPath(){      //Получение полного пути к проекту
        File file = new File("AllInOne");
        System.out.println(file.getAbsolutePath());
    }
}
