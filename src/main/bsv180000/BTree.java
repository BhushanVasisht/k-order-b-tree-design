package main.bsv180000;

public class BTree<T> {
    int order;
    BTreeNode<T> root;

    BTree(int ord, T rootVal) {
        this.order = ord;
        this.root = new BTreeNode<T>(ord, rootVal);
    }

    public void insert(T value) {

    }

    public String toString() {
        StringBuilder buffer = new StringBuilder(50);
//        print(buffer, "", "");
        return buffer.toString();
    }

//    private void print(BTreeNode node, StringBuilder buffer, String prefix, String childrenPrefix) {
//        buffer.append(prefix);
//        buffer.append(node.);
//        buffer.append('\n');
//
//        BTreeNode next = node;
//        if (it.hasNext()) {
//            next.print(buffer, childrenPrefix + "├── ", childrenPrefix + "│   ");
//        } else {
//            next.print(buffer, childrenPrefix + "└── ", childrenPrefix + "    ");
//        }
//    }
}
