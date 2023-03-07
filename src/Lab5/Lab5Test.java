package Lab5;

public class Lab5Test {
    public static void main(String [] args){
        LinkedBinaryTree<String> treeQ2 = new LinkedBinaryTree<String>();
        treeQ2.addRoot("a");
        Position<String> a = treeQ2.root();
        treeQ2.addLeft(treeQ2.root(), "b");
        treeQ2.addRight(treeQ2.root(), "c");
        Position<String> b = treeQ2.left(a);
        Position<String> c = treeQ2.right(a);
        treeQ2.addLeft(b, "e");
        treeQ2.addRight(b, "f");
        Position<String> e = treeQ2.left(b);
        Position<String> f = treeQ2.right(b);
        treeQ2.addLeft(e, "n");
        treeQ2.addLeft(f, "i");
        treeQ2.addRight(f, "k");
        treeQ2.addLeft(c, "g");
        treeQ2.addRight(c, "h");
        System.out.println(treeQ2.countExternal(treeQ2.root()));
        System.out.println(treeQ2.countPathLength());

        LinkedBinaryTree<String> treeQ3 = new LinkedBinaryTree<String>();
        treeQ3.addRoot("a");
        treeQ3.addLeft(treeQ3.root(), "b");
        treeQ3.addRight(treeQ3.root(), "c");
        System.out.println(treeQ3.countPathLength());
    }
}
