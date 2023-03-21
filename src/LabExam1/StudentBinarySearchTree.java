package LabExam1;

public class StudentBinarySearchTree extends LinkedBinaryTree<Student>{
    public StudentBinarySearchTree() {
        super();
    }

    public Position<Student> search(Student student){
        if(isEmpty()){
            return null;
        } else {
            return search(student, root);
        }
    }

    public Position<Student> search(Student student, Position<Student> p ){
        if(isExternal(p)){
            return p;
        } else if(student.getKey() < p.getElement().getKey()){
            return search(student, left(p));
        } else if(student.getKey() == p.getElement().getKey()){
            return p;
        } else{
            return search(student, right(p));
        }
    }

    public void put(Student student) {
        if(isEmpty()) {
            addRoot(student);
            addLeft(root, null);
            addRight(root, null);
        } else {
            put(student, search(student));
        }
    }

    public void put(Student student, Position<Student> p) {
        // If key exists, overwrite the value
        if(p.getElement()!= null && student.getKey() == p.getElement().getKey()){
            p.setElement(student);
        } else{
            // If they key does not already exist in the tree, insert at leaf and create new leaves
            p.setElement(student);
            addLeft(p, null);
            addRight(p, null);
        }
    }

    public boolean isProperTree(){
        if(isEmpty()){
            return true;
        }
        Iterable<Position<Student>> positions = inorder();
        for(Position<Student> p : positions){
            if(!isExternal(p)){
                if(left(p) == null || right(p) == null){
                    return false;
                }
            }
        }
        return true;
    }
}
