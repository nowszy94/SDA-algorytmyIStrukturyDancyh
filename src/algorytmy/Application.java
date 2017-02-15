package algorytmy;

import algorytmy.structures.MyList;

public class Application {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(2);
        myList.add(3);
        myList.add(-3);
        myList.add(-1);
        myList.add(0);
        myList.add(2);
        myList.add(-1);
        myList.add(-7);
        myList.add(-4);
        myList.add(-2);
        myList.add(-1);
        myList.add(-9);
        myList.add(9);
        MyList clonedList = myList.clone();
        clonedList.add(5);
    }
}
