package io_task;

import java.io.*;

public class PathTaskMain {

    public static void main (String[]args) throws IOException {
        CopyPaste.copyPaste();
        System.out.println("");
        PrintProjectPath.projectPath();
        System.out.println("");
        CountWords.prepositionCounter();
        System.out.println("");
        PrintDirectoryFiles.printDirectoryFiles();
    }
}

