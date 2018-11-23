package by.bntu.fitr.controller;

import by.bntu.fitr.chars.CharReader;
import by.bntu.fitr.chars.VowelSolver;

import java.util.Scanner;

public class VowelController implements Executable {
    private VowelSolver solver = new VowelSolver();
    private Scanner sc = new Scanner(System.in);
    private CharReader reader = new CharReader();

    @Override
    public void execute() {
        System.out.println("List implementation.");
        System.out.println(solver.isVowelContains(reader.read()));
        System.out.println("If statement.");
        System.out.println(solver.ifVowel(reader.read()));
        System.out.println("Switch statement.");
        System.out.println(solver.switchVowel(reader.read()));
    }
}
