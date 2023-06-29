package ru.gb;

import java.io.*;

public class Backup {

    public void startBackup(File from, File to) throws IOException {
        File[] listFiles = from.listFiles();
        if (!to.exists()) {
            to.mkdir();
        }
        assert listFiles != null;
        for (File file : listFiles) {
            if (file.isFile()) {
                copy(file, new File(to + "/" + from.getName() + "_" + file.getName()));
            } else {
                startBackup(file, to);
            }
        }
    }

    private void copy(File from, File to) throws IOException {
        InputStream is = new FileInputStream(from);
        OutputStream os = new FileOutputStream(to);
        byte[] buffer = new byte[256];
        while (is.read(buffer) != -1) {
            os.write(buffer);
        }
        is.close();
        os.close();
    }
}
