package bin;

public class App {
    public static void main(String[] args) {
        MyList myList = new MyList(2);
        myList.addFirst( 3);
        myList.addFirst( 5);
        myList.addFirst( 7);
        myList.add(2,4);
        System.out.println("gia tri truoc KHI REMOVE");
        myList.printList();
        myList.remove(5);
        System.out.println("gia tri SAU KHI REMOVE");
        myList.printList();
    }
}
