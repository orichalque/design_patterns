package org.iut.nantes.decorator.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("src/main/resources/stream.txt");

        if (f.exists())
            Files.delete(f.toPath());
        if (!f.createNewFile()) {
            throw new IOException("Could not create the file");
        }

        Files.write(f.toPath(), "123456789".getBytes());

        FileInputStream fileInputStream = new FileInputStream(f);
        System.out.println(new String(fileInputStream.readAllBytes()));

        InputStream stream = new ReverseInputStream(new FileInputStream(f));

        StringBuilder s = new StringBuilder();
        int c;
        do {
            c =  stream.read();
            s.append((char) c);
        } while (c != -1);

        System.out.println(s.toString());
    }
}
