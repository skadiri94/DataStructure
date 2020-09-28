package Lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CP3LinkedListTest {

    @org.junit.jupiter.api.Test
    void getFirst() {

        CP3LinkedList<String> list = new CP3LinkedList();
        list.addFirst("Anne");
        list.addFirst("Bob");
        list.addFirst("Bill");

        String s = list.getFirst();
        assertEquals("Bill", s);
    }

    @org.junit.jupiter.api.Test
    void addFirst() {
    }

    @org.junit.jupiter.api.Test
    void removeFirst() {
        CP3LinkedList<String> list = new CP3LinkedList();
        list.addFirst("Anne");
        list.addFirst("Bob");
        list.addFirst("Bill");
        list.removeFirst();
        String s = list.getFirst();
        assertEquals("Bob", s);

    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
    }

    @Test
    void testSize() {
        CP3LinkedList<String> list = new CP3LinkedList();
        CP3LinkedList<String> emptyList = new CP3LinkedList();
        CP3LinkedList<String> oneList = new CP3LinkedList();
        list.addFirst("Anne");
        list.addFirst("Bob");
        list.addFirst("Bill");

        oneList.addFirst("Anne");

        int s = list.size();
        int s0 = emptyList.size();
        int s1 = oneList.size();

        assertEquals(3, s);
        assertEquals(0, s0);
        assertEquals(1, s1);




    }

    @Test
    void containsElement() {

        CP3LinkedList<String> list = new CP3LinkedList();
        list.addFirst("Anne");
        list.addFirst("Bob");
        list.addFirst("Bill");

      assertTrue(list.containsElement("Bob"));
      assertFalse(list.containsElement("Bills"));



    }

    @Test
    void containsElementFalse() {

        CP3LinkedList<String> list = new CP3LinkedList();
        list.addFirst("Anne");
        list.addFirst("Bob");
        list.addFirst("Bill");

        assertFalse(list.containsElement("Bills"));



    }

}