package com.me;

//step 32 create search tree class
//step 33 implements NodeList
public class SearchTree implements NodeList{

    //step 34 create field
    private ListItem root = null;

    //step 35 constructor
    public SearchTree(ListItem root) {
        this.root = root;
    }

    //step 36 implement methods override
    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        //step 40 addItem method(keeps traversing the tree)
        if (this.root==null) {
            //the tree was empty, so our item becomes the head of the tree
            this.root = newItem;
            return true;
        }

        //otherwise, start comparing from the head of the tree
        ListItem currentItem = this.root;
        while (currentItem!=null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {
                //newItem is greater, move right if possible
                if (currentItem.next()!=null) {
                    currentItem = currentItem.next();
                } else {
                    //there is no node to the right, so add at this point
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0) {
                //newItem is less, move left if possible
                if (currentItem.previous()!=null) {
                    currentItem = currentItem.previous();
                } else {
                    //there is no node to the left, so add at this point
                    currentItem.setPrevious(newItem);
                    return true;
                }
            }else {
                //equal, so don't add
                System.out.println(newItem.getValue() + " is already present");
                return false;
            }
        }
        //we can't actually get here, but Java complains if there is no return
        return false;

        //step 41 go back to main to run

    }


    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        //step 37 ***RECURSIVE METHOD
        if(root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());

            //step 38 go to main


        }


    }
}

