package test_practice;

import java.util.ArrayList;
import java.util.HashMap;

public class BFInterpreter implements Command{


    private static Class c;
    private static String code;
    private static int[] memory;

    private static int currentCell, charIndex;
    private static ArrayList<Integer> cyclePositions;

    private static void activateSyntax()
    {
        memory = new int[30000];
        currentCell = 0;
        charIndex = 0;
        cyclePositions = new ArrayList<>();
        HashMap<Character, String> syntax = new HashMap<>();
        syntax.put('+', "increment");
        syntax.put('-', "decrease");
        syntax.put('.', "print");
        syntax.put('>', "nextCell");
        syntax.put('<', "previousCell");
        syntax.put('[', "cycle");
        syntax.put(']', "repeat");
    }

    public void increment() { memory[currentCell]++; }
    public void decrement() { memory[currentCell]--; }
    public void output() { System.out.print((char) memory[currentCell]); }
    public void nextCell() { currentCell++; }
    public void previousCell() { currentCell--; }
    public void cycle()
    {
        int index = code.length() - 1;
        for (int i = 1; i <= cyclePositions.size() + 1; i++) while (code.charAt(index) != ']') index--;
        if (memory[currentCell] == 0) charIndex = index;
        else cyclePositions.add(charIndex);
    }

    public void repeat() {
        if (memory[currentCell] != 0) charIndex = cyclePositions.get(cyclePositions.size() - 1);
        else cyclePositions.remove(cyclePositions.size() - 1);
    }

    public static void main(String[] args) {

    }

}
