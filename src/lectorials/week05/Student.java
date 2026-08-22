package lectorials.week05;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String sNum;

    public Student(String name, String sNum) {
        this.name = name;
        this.sNum = sNum;
    }

    public String getsNum() {
        return sNum;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return name + "," + sNum;
    }


}
