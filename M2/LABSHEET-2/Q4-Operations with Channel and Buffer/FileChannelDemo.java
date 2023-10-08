import java.io.*;
import java.nio.*;
import java.nio.channels.FileChannel;

public class FileChannelDemo {
    public static void main(String args[]) {
        String data = "iphone 6 50000";
        write("tablet.store", data);
        read("tablet.store");
    }

    public static void write(String filename, String data) {
        try {
            RandomAccessFile store = new RandomAccessFile(filename, "rw");
            FileChannel channel = store.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(data.length());
            for (int i = 0; i < data.length(); i++) {
                buffer.put((byte) (data.charAt(i)));
            }
            // Rewinds buffer, the position is set to zero
            buffer.rewind();
            channel.write(buffer);
            channel.close();
            store.close();
        } catch (Exception e) {
        }
    }

    public static void read(String filename) {
        try {
            RandomAccessFile store = new RandomAccessFile(filename, "rw");
            FileChannel channel = store.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            int numOfBytesRead = channel.read(buffer);
            System.out.println("number of bytes read : " + numOfBytesRead);
            for (int i = 0; i < numOfBytesRead; i++) {
                char c = (char) buffer.get(i);
                System.out.print(c);
            }
            channel.close();
            store.close();
        } catch (Exception e) {
        }
    }
}

