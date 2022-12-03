package main.bsv180000;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        BTree<Integer> testBTree = new BTree<>(5, 7);

        for(int item : List.of(16, 1, 5, 21, 2, 3, 4, 0)) {
            testBTree.insert(item);
            testBTree.toString();
        }
    }
}
