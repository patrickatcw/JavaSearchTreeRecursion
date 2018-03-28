package com.me;

//step 1 create this class
//step 2 make abstract class

public abstract class ListItem {

    //step 3 fields
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;

    //step 4 object parameter
    protected Object value;

    //step 5 constructor
    public ListItem(Object value) {
        this.value = value;
    }

    //step 6 methods
    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);

    //step 7 getter and setter for value
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;

        //step 8 create Node class

    }
}
