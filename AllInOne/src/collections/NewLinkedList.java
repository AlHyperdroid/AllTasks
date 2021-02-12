package collections;

public class NewLinkedList {

    class Element{
        String thing;
        Element perv;
        Element next;
        public Element (String thing){
            this.thing = thing;
        }
    }
    Element first, last = null;

    public void addElement(String thing){
        Element newElement = new Element(thing);

        if(first == null){
            first = last = newElement;
            first.perv = null;
            last.next = null;

        }else{
            last.next = newElement;
            newElement.perv = last;
            last = newElement;
            last.next = null;
        }
    }
    public void printElements() {
        Element curr = first;

        if (first == null) {
            System.out.println("List is empty");
            return;
        }

        while(curr != null) {
            System.out.println(curr.thing + " ");
            curr = curr.next;

        }
    }
    public static void main(String[] args) {

        NewLinkedList linkedList = new NewLinkedList();
        NewLinkedList linkedListI = new NewLinkedList();
        linkedList.addElement("this");
        linkedList.addElement("is");
        linkedList.addElement("smth");
        linkedList.addElement("strange");
        linkedList.addElement("thing");

        linkedList.printElements();
        linkedListI.printElements();

        linkedListI.addElement("What is this");
        linkedListI.printElements();
    }
}
