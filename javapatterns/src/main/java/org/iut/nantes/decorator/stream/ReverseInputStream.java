package org.iut.nantes.decorator.stream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReverseInputStream extends FilterInputStream {
    private int curr;
    private byte[] bytes;

    /**
     * Creates a {@code FilterInputStream}
     * by assigning the  argument {@code in}
     * to the field {@code this.in} so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or {@code null} if
     *           this instance is to be created without an underlying stream.
     */
    protected ReverseInputStream(InputStream in) {
        super(in);
        try {
            bytes = in.readAllBytes();
            curr = bytes.length;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int read() throws IOException {
        if (curr == 0)
            return -1;
        else {
            int i = bytes[curr - 1];
            curr --;
            return i;
        }
    }
}
