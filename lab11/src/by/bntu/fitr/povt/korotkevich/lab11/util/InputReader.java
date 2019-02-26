package by.bntu.fitr.povt.korotkevich.lab11.util;

import java.io.InputStream;
import java.util.Scanner;

public class InputReader {
    private Scanner sc;

    public InputReader() {
        this.sc = new Scanner(System.in);
    }

    public InputReader(InputStream stream) {
        this.sc = new Scanner(stream);
    }

    public InputReader(Readable readable) {
        this.sc = new Scanner(readable);
    }

    public String read() {
        return sc.nextLine();
    }
}
