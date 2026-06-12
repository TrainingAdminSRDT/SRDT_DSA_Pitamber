
import java.util.LinkedList;

public class DoublyLinkedList {

    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<>();

        list.add("Element 2");      
        list.addFirst("Element 1");  
        list.addLast("Element 7"); 
        
        // Corrected: Adds to the second position (index 1)
        list.add(1, "Element 4"); 
         list.add(2, "Element 5");  
 

        // Remove elements
        list.removeFirst();
        list.removeLast();
        list.remove(2);

    
        System.out.println(list);
    }
}