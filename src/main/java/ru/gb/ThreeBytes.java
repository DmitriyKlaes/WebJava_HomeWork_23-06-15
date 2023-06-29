package ru.gb;

import java.io.*;

public class ThreeBytes {

    public void write(byte[] arrayField) throws IOException {
        try (OutputStream os = new BufferedOutputStream(new FileOutputStream("ttt.txt"))) {
            for (byte b : arrayField) {
                os.write(b);
                os.flush();
            }
        }
    }
}
