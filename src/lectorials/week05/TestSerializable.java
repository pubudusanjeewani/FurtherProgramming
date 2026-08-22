package lectorials.week05;

import java.io.*;
import java.util.ArrayList;

public class TestSerializable {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Student s1 = new Student("Tim", "s123");
        Student s2 = new Student("Amy", "s124");

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);

        FileOutputStream fo = new FileOutputStream("students.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fo);
        oos.writeObject(students);
        oos.close();

        FileInputStream fi = new FileInputStream("students.ser");
        ObjectInputStream ois = new ObjectInputStream(fi);
        ArrayList<Student> studentsFromFile = (ArrayList<Student>) ois.readObject();

        for(Student s: studentsFromFile){
            System.out.println(s);
        }

        ois.close();

    }
}

