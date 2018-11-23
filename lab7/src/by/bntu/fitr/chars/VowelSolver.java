package by.bntu.fitr.chars;

import java.util.ArrayList;
import java.util.List;

public class VowelSolver {
    private List<Character> vowels = new ArrayList<>();
    {
        vowels.add('e');
        vowels.add('a');
        vowels.add('i');
        vowels.add('u');
        vowels.add('o');
        vowels.add('y');
    }

    public boolean isVowelContains(char symbol) {
        return vowels.contains(symbol);
    }

    public boolean ifVowel(char symbol) {
        boolean isVowel = false;
        if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' ||
                symbol == 'u' || symbol == 'y') {
            isVowel = true;
        }
        return isVowel;
    }

    public boolean switchVowel(char symbol) {
        boolean isVowel = false;
        switch(symbol) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                isVowel = true;
                break;
        }
        return isVowel;
    }
}
