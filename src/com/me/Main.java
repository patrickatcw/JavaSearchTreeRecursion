package com.me;

//program start from JavaAbstractClassesExample
//step 32 working on SEARCHTREE
//step 32 create searchTree class

public class Main {

    public static void main(String[] args) {

        //step 21 instance
        MyLinkedList list = new MyLinkedList(null);

        //step 22 call method
        list.traverse(list.getRoot());

        //given code
        //create a string data array to avoid typing loads of additems instructions
        //String stringData = "Columbus Akron Dayton Canton Cleveland Cadiz Lorain Cleveland";

        //step 28 change the above to.......
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

        //step 23 run
        //result; The list is empty

        String[]data = stringData.split(" ");
        for(String s : data){

            //step 24 calling method
            list.addItem(new Node(s));

        }

        //step 25 calling method
        list.traverse(list.getRoot());

        //step 26 run
        /*
        results;
        The list is empty
        Cleveland is already present, not added.
        Akron
        Cadiz
        Canton
        Cleveland
        Columbus
        Dayton
        Lorain*/

        //step 27 return to MyLinkedList public boolean removeItem

        //step 30 calling on those methods
        list.removeItem(new Node("3"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("5"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("0"));
        list.removeItem(new Node("4"));
        list.removeItem(new Node("2"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("9"));
        list.traverse(list.getRoot());
        list.removeItem(new Node("8"));
        list.traverse(list.getRoot());
        list.removeItem(new Node("6"));
        list.traverse(list.getRoot());
        list.removeItem(list.getRoot());
        list.traverse(list.getRoot());
        list.removeItem(list.getRoot());
        list.traverse(list.getRoot());

        //step 31 run
        //obtained results

    }

}

