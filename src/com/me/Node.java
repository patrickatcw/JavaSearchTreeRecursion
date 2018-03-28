package com.me;

//step 8 create node class
//step 9 extends ListItem
public class Node extends ListItem{

    //step 10 constructor
    public Node(Object value) {
        super(value);

    }

    //step 11 override methods
    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem item) {
        if(item != null){
            return ((String) super.getValue()).compareTo((String) item.getValue());
        }else {
            return -1;

            //step 12 create NodeList interface

        }
    }
}



