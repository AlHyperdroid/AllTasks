package io_task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class CopyPaste {

    public static void copyPaste()throws IOException {  //Копирование файла из одного места в другое
        File sourceFile = new File("C:(path)\\AnotherStrangeThing.txt");
        File destFile = new File("C:(path)\\AnotherStrangeThing.txt");

        FileChannel source = null;
        FileChannel destination = null;

        try {
            source = new FileInputStream(sourceFile).getChannel();
            destination = new FileOutputStream(destFile).getChannel();
            destination.transferFrom(source, 0, source.size());
        }
        finally {
            if(source != null) {
                source.close();
            }
            if(destination != null) {
                destination.close();
            }
            System.out.println("Copied sucsessfully to " + destFile.getName());
        }
    }
}
