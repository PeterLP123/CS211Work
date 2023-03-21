package LabExam1;

public class Student {
    public int key;
    public String name;

    public Student(int key, String name) {
        this.key = key;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getKey() {
        return key;
    }
}
