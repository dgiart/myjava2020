package HW5;

import java.io.BufferedReader;
        import java.io.DataInputStream;
        import java.io.FileInputStream;
        import java.io.FileReader;
        import java.io.IOException;
        import java.io.InputStream;
        import java.io.RandomAccessFile;
        import java.nio.file.Files;
        import java.nio.file.Paths;
        import java.util.Arrays;



public class RafTest {
    private static final String INTS_DAT = "ints.dat";
    private static final int NINTS = 10;
    private static final int NCHARS = NINTS * 2;
    private static final int NBYTES = NINTS * 4;

    public static void test1() throws IOException {
        try {
            Files.delete(Paths.get(INTS_DAT));
        } catch (IOException e) {
            // nothing
        }
        try (RandomAccessFile file = new RandomAccessFile(INTS_DAT, "rw");) {
            for (int i = 0; i < NINTS; i++) {
                file.writeInt(i);
            }

            // (1)
            file.seek(0);
            int[] ints = new int[NINTS];
            for (int i = 0; i < NINTS; i++) {
                ints[i] = file.readInt();
            }
            System.out.println("By RandomAccessFile as int: " + Arrays.toString(ints));

            // (2)
            file.seek(0);
            char[] chars = new char[NCHARS];
            for (int i = 0; i < NCHARS; i++) {
                chars[i] = file.readChar();
            }
            System.out.println("By RandomAccessFile as char: " + Arrays.toString(chars));

            // (3)
            file.seek(0);
            byte[] bytes = new byte[NBYTES];
            for (int i = 0; i < NBYTES; i++) {
                bytes[i] = (byte) file.read();
            }
            System.out.println("By RandomAccessFile as byte: " + Arrays.toString(bytes));
        }

        try (DataInputStream din = new DataInputStream(new FileInputStream(INTS_DAT));) {
            int[] ints = new int[NINTS];
            for (int i = 0; i < NINTS; i++) {
                ints[i] = din.readInt();
            }

            System.out.println("By DataInputStream as int: " + Arrays.toString(ints));
        }

        try (InputStream in = new FileInputStream(INTS_DAT);) {
            int[] ints = new int[NBYTES];
            for (int i = 0; i < NBYTES; i++) {
                ints[i] = in.read();
            }
            System.out.println("By InputStream as bytes: " + Arrays.toString(ints));
        }

        try (BufferedReader bin = new BufferedReader(new FileReader(INTS_DAT));) {
            int[] ints = new int[NBYTES];
            for (int i = 0; i < NBYTES; i++) {
                ints[i] = bin.read();
            }
            System.out.println("By Reader as bytes: " + Arrays.toString(ints));
        }

        byte[] bytes = Files.readAllBytes(Paths.get(INTS_DAT));
        System.out.println("By Files as bytes: " + Arrays.toString(bytes));
        System.out.println("Bytes to String: " + new String(bytes));
    }



    public static void test2() throws IOException  {
        // 4 -> size of int
        final int kB = 1024;
        final int mB = kB * 1024;
        final int n = mB / 4 ;
        try {
            Files.delete(Paths.get(INTS_DAT));
        } catch (IOException e) {
            // nothing
        }
        long start = System.currentTimeMillis();
        try (RandomAccessFile file = new RandomAccessFile(INTS_DAT, "rw");) {
            for (int i = 0; i < n; i++) {
                file.writeInt(i);
            }
        }
        System.out.println("Write time by writeInt(int): " + (System.currentTimeMillis() - start));

        try {
            Files.delete(Paths.get(INTS_DAT));
        } catch (IOException e) {
            // nothing
        }
        byte[] bytes = new byte[4];
        start = System.currentTimeMillis();
        try (RandomAccessFile file = new RandomAccessFile(INTS_DAT, "rw");) {
            for (int i = 0; i < n; i++) {
                bytes[0] = (byte)((i >>> 24) & 0xFF);
                bytes[1] = (byte)((i >>> 16) & 0xFF);
                bytes[2] = (byte)((i >>>  8) & 0xFF);
                bytes[3] = (byte)((i >>>  0) & 0xFF);
                file.write(bytes);
            }
        }
        System.out.println("Write time by write(byte[]): " + (System.currentTimeMillis() - start));
    }

    public static void main(String[] args) throws IOException {
        test1();
        test2();
    }
}