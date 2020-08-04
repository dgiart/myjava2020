package HW5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Part4 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile file = null;
        file = new RandomAccessFile("part4.txt", "rw");
        file.write(65);
        file.close();
        }
}
