package lectorials.week05;

import java.io.*;

public class BinaryIO {
    public static void main(String[] args) throws IOException {
        FileOutputStream fo = new FileOutputStream("students.dat");
        ObjectOutputStream oo = new ObjectOutputStream(fo);
        oo.writeUTF("Tim");
        oo.writeInt(70);
        oo.writeUTF("Amy");
        oo.writeInt(90);
        oo.close();

        FileInputStream fi = new FileInputStream("students.dat");
        ObjectInputStream oi = new ObjectInputStream(fi);
        System.out.println(oi.readUTF());
        System.out.println(oi.readInt());
        System.out.println(oi.readUTF());
        System.out.println(oi.readInt());
        oi.close();

    }
}
