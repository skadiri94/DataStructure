package Lab2;

public class CP3LinkedListMain {

    public static void main(String[] args) {

        CP3LinkedList <String> list = new CP3LinkedList();
        list.addFirst("Anne");
        list.addFirst("Bob");
        list.addFirst("Bill");
        list.print();

        list.removeFirst();
        String s = list.getFirst();
        System.out.println("\n\n" + s);


    }
}
