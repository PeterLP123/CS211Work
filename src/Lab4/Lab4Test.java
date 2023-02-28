package Lab4;
public class Lab4Test {
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
        /*treeQ2.printChildren(a);
        treeQ2.swapChildren(a);
        treeQ2.printChildren(a);*/
        treeQ2.printChildren(a);
        treeQ2.printChildren(b);
        treeQ2.swap(c, f);
        treeQ2.printChildren(a);
        treeQ2.printChildren(b);
    }
}
