package lectorials.week05;

import java.io.*;
import java.util.ArrayList;

public class TestFileIO {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Student s1 = new Student("Tim", "s123");
        Student s2 = new Student("Amy", "s124");
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);

        FileWriter fw = new FileWriter("students.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);

        for(Student s: students){
            fw.write(s.getName() + "," + s.getsNum() + "\n");
        }

        bw.close();

        FileReader fr = new FileReader("students.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while(line != null){
            System.out.println(line);
            line = br.readLine();
        }
        //br. lines();
        br.close();
    }

}
