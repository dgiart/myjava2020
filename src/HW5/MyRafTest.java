package HW5;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class MyRafTest {
    public static void main(String[] args) {
        RandomAccessFile file;

        {
            try {
                file = new RandomAccessFile("my_raf.txt", "rw");
//                file.writeInt(1);
                file.writeChars("qqq");
                System.out.println("file.length: " + file.length());
                file.seek(0);
                double x = file.readDouble();
                System.out.println(x);
                file.seek(file.length() - 8);
                char s = file.readChar();
                System.out.println(s);
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
