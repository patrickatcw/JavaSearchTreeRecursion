package com.me;


//step 14 create this class
//step 15 implements nodelist
public class MyLinkedList implements NodeList {

    //step 16 field
    private ListItem root = null;

    //step 17 constructor
    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    //step 18 implements overrides
    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root==null) {
            //the list was empty, so this item becomes the head of the list
            this.root = newItem;
            return true;
        }

        //step 19
        ListItem currentItem = this.root;
        while (currentItem!=null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {
                //newItem is gretaer, move right if possible
                if (currentItem.next()!=null) {
                    currentItem = currentItem.next();
                } else {
                    //there is no next, so insert at end of list
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                // newItem is less, insert before
                if (currentItem.previous()!=null) {
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                } else {
                    //the node with a previous is the root
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                //equal
                System.out.println(newItem.getValue() + " is already present, not added.");
                return false;
            }
        }

        return false;

    }

    @Override
    public boolean removeItem(ListItem item) {
        //return false;
        //step 27 remove above then add.....
        if (item!=null) {
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                //found the item to delete
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next()!=null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else {//comparison > 0
                //we are at an item greater than the one to be deleted
                //so the item is not in the list
                return false;
            }

        }
        //we have reached the end of the list
        //without finding the item to delete
        return false;

        //step 28 go back to main to test

    }

    @Override
    public void traverse(ListItem root) {
        //step 20
        if (root==null) {
            System.out.println("The list is empty");
        } else {
            while (root!=null) {
                System.out.println(root.getValue());
                root = root.next();

                //step 21 to main to run

            }
        }
    }
}


