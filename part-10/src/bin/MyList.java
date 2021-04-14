package bin;

public class MyList {
    private MyNode head;
    private  int numNodes = 0;

    public int getNumNodes(){
        return numNodes;
    }

    public MyList(Object data) {
        head = new MyNode(data);
    }
    public void add(int index, Object data){
        MyNode temp = head;
        MyNode holder;
        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }

        holder = temp.next;

        MyNode insertNode = new MyNode(data);

        temp.next=insertNode;
        insertNode.next = holder;
        numNodes++;
    }
    public void addFirst(Object data){
        MyNode temp = head;
        head = new MyNode(data);
        head.next = temp;
        numNodes++;
    }
//    public void addLast(Object data) {
//        MyNode temp = head;
//    }
    public void printList(){
        MyNode temp = head;
        while (temp!= null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public MyNode get(int index){
        MyNode temp= head;
        for (int i=0;i<index;i++){
            temp=temp.next;
        }
        System.out.println("gia tri can lay la = " + temp.data);
        return temp;
    }
    public void removeFirst(){
        MyNode temp = head;
        head = temp.next;
        temp = null;
        numNodes--;
    }
    public void remove(int index){
        MyNode temp = head;
        for (int i = 0; i < index-1 && temp != null ; i++) {
            temp = temp.next;
        }

        MyNode holder;
        if (temp.next != null) {
            MyNode delNote = temp.next;
            holder = delNote.next;
            temp.next = holder;
            delNote = null;
            numNodes--;
        } else System.out.println("Invalid index!");


    }
}
