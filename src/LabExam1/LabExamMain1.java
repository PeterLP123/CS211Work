package LabExam1;

public class LabExamMain1 {
    public static void main(String[] args) {
        Student john = new Student(2, "John");
        Student joe = new Student(8, "Joe");
        Student olivia = new Student(1, "Olivia");
        Student emma = new Student(4, "Emma");
        Student tom = new Student(5, "Tom");
        Student stephen = new Student(3, "Stephen");
        Student charlotte = new Student(6, "Charlotte");
        Student sophia = new Student(9, "Sophia");

        StudentBinarySearchTree tree = new StudentBinarySearchTree();
        tree.put(john);
        tree.put(joe);
        tree.put(olivia);
        tree.put(emma);
        tree.put(tom);
        tree.put(stephen);
        tree.put(charlotte);
        tree.put(sophia);

        Iterable<Position<Student>> positions = tree.inorder();
        for(Position<Student> p : positions) {
            if(p.getElement() != null) {
                System.out.println(p.getElement().getKey() + ", " + p.getElement().getName());
            }
        }

        System.out.println("This is a proper tree: " + tree.isProperTree());
    }
}
