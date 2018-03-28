package com.me;

//program start from JavaAbstractClassesExample
//step 32 working on SEARCHTREE
//step 32 create searchTree class

public class Main {

    public static void main(String[] args) {

        //step 21 instance
        //MyLinkedList list = new MyLinkedList(null);

        //step 38 change the above
        SearchTree tree = new SearchTree(null);
        //step 39 change all list to tree, then comment out

        //step 40, once those are changed, go back to searchtree
        //and add our additem methods

        //step 41 back from searchtree to run
        /*
        results;(sorted in order)
        0
        1
        2
        3
        4
        5
        6
        7
        8
        9*/

        //step 42 searchtree removeitem

        //step 22 call method
        tree.traverse(tree.getRoot());

        //step 23 run
        //result; The list is empty


        //given code
        //create a string data array to avoid typing loads of additems instructions
        //String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

        //step 28 change the above to....
        String stringData = "5 7 3 9 8 2 1 0 4 6";
        //step 29 run
        /*
        results;
        The list is empty
        0
        1
        2
        3
        4
        5
        6
        7
        8
        9*/

        String[]data = stringData.split(" ");
        for(String s : data){

            //step 24 calling method
            tree.addItem(new Node(s));

        }

        //step 25 calling method
        //tree.traverse(tree.getRoot());
        //step 44 comment out above and uncomment line 91 to 111
        //step 45 run, works great!

        //step 26 run
            /*
            results;
            The list is empty
            Canberra is already present, not added.
            Adelaide
            Brisbane
            Canberra
            Darwin
            Melbourne
            Perth
            Sydney
            */

        //step 27 return to MyLinkedList public boolean removeItem

        //step 30 calling on those methods

        tree.removeItem(new Node("3"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("5"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("0"));
        tree.removeItem(new Node("4"));
        tree.removeItem(new Node("2"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("9"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("8"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("6"));
        tree.traverse(tree.getRoot());
        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());
        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());

        //step 31 run
        //obtained results

        //step 32 working on SEARCHTREE
        //step 32 create searchTree class

    }
}

