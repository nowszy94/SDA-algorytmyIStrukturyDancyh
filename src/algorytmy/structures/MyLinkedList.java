package algorytmy.structures;

public class MyLinkedList implements MyListInterface {

    private int value;

    private MyLinkedList next;


    @Override
    public void add(int value) {
        MyLinkedList myLinkedList = getLast();
        MyLinkedList tmpObject = new MyLinkedList();
        tmpObject.value = value;
        myLinkedList.next = tmpObject;
    }

    private MyLinkedList getLast() {
        MyLinkedList myLinkedList = this;
        while (myLinkedList.next != null) {
            myLinkedList = myLinkedList.next;
        }
        return myLinkedList;
    }

    @Override
    public void add(int index, int value) {
    }

    @Override
    public int get(int index) {
        MyLinkedList myLinkedList = this;
        for (int i = 0; i <= index; i++) {
            if (myLinkedList.next == null) {
                System.out.println("Wrong index");
                return 0;
            }
            myLinkedList = myLinkedList.next;
        }
        return myLinkedList.value;
    }

    @Override
    public void put(int index, int value) {

    }

    @Override
    public void addAll(MyListInterface myList) {

    }

    @Override
    public void addAll(int index, MyListInterface myList) {

    }

    @Override
    public void delete(int index) {

    }

    @Override
    public MyListInterface clone() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }
}
