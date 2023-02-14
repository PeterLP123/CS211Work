package Lab2;
public class Task {
    private String name;
    private int length;

    public Task(String name, int length){
        this.name = name;
        this.length = length;
    }

    public String get_name(){
        return name;
    }

    public int get_length(){
        return length;
    }

    public void set_length(int length){
        this.length = length;
    }

    public void set_name(String name){
        this.name = name;
    }
}
