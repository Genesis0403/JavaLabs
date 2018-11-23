package by.bntu.fitr.task_3.model;

import  java.util.Random;

public class Mood {
    public String execute(){
        Random random = new Random();
        byte number = (byte)(random.nextInt(6) + 1);
        String mood = null;
        switch (number){
            case 1: mood = "   ******\n *       *\n*   > <   *\n*    =    *\n  *     *\n  ****** ";
            break;
            case 2: mood = "   ******\n *       *\n*   _ _   *\n*    _    *\n  *     *\n  ****** ";
            break;
            case 3: mood = "   ******\n *       *\n*   ^ ^   *\n*    ~    *\n  *     *\n  ****** ";
            break;
            case 4: mood = "   ******\n *       *\n*   o o   *\n*    X    *\n  *     *\n  ****** ";
            break;
            case 5: mood = "   ******\n *       *\n*   ^ ^   *\n*    U    *\n  *     *\n  ****** ";
            break;
            case 6: mood = "   ******\n *       *\n*   U U   *\n*    Q    *\n  *     *\n  ****** ";
            break;
        }
        return mood;
    }
}
