import java.util.LinkedList;
import java.util.ListIterator;

import javax.print.event.PrintEvent;

/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo
{
    public static void main(String[] args)
    {
        /*
         * The addLast method can be used to populate a list.
         * 
         */
        LinkedList<String> staff = new LinkedList<>();
        staff.addLast("Diana");
        staff.addLast("Harry");
        staff.addLast("Romeo");
        staff.addLast("Tom");

        // This list is current: Diana, Harry, Romeo, Tom
        /*
         * The listIterator method creates a new list iterator that is positioned at the front of the list.
         * 
         * The "|" in the comment represents the iterator position
         * 
         */
        ListIterator<String> iterator = staff.listIterator(); // |DHRT

        /*
         * the next method advanced the iterator over the next element in the list.
         * 
         */

         iterator.next(); //D|HRT

        /*
         * The next method also returns the element that the iterator is passing
         */
        String name = iterator.next();
        System.out.println("Expected: Harry");
        
        /*
         * The add method inserts an element at the iterator position. 
         * The iterator is then positioned afer the element that was added 
         */
        iterator.add("Juliet"); //DHJ|RT
        iterator.add("Nina"); //DHJN|RT

        /*
         * The remove method removes the element returned by the last call to next or previous. 
         * Can only be called once after calling next or previous.
         * The remove metho dcannot be called after iterator.add
         * 
         */
        iterator.next();            //DHJR|T
        iterator.remove();          //DHJN|T     (No romeo)
        
        System.out.println(staff);
        System.out.println("Expected: [Diana, Harry, Juliet, Nina, Tom]");


        /*
         * The set method updates the elemetn returned by the last call to next or previous
         */
        iterator.previous();        // DHJ|NT
        iterator.set("Albert");   // DHJ|AT


        /*
         * The Has next method is often used in the context of a while loop
         */
        iterator = staff.listIterator();            // |DHJAT
        while(iterator.hasNext()){
            
            String n = iterator.next();
            if (n.equals("Juliet")){
                iterator.remove();                  //DHJ|AT        DH|AT 
            }

        }                                           //DHAT | 


        /*
         * Enhanced for loops work with Linked lists!
         * 
         */

         for(String n: staff){
            System.out.print(n+" ");
         }
         System.out.println();
         System.out.println("Expected: Diana, Harry, Albert, Tom");


        /*
         * Concurrent modification Exception
         * Can't modify a linked list while also using an iterator unless you use that iterator to do so.
         * 
         */
        iterator = staff.listIterator();
        while(iterator.hasNext()){
            String n = iterator.next();
            if(n.equals("Harry")){            //     staff.remove('Diana');
            // }
            }
        }
        


        /* 
         * ConcurrentMdoification Exception
         * the enhanced for loop atuomatically creates an iterator.
         * 
         */

         for (String o : staff){
            if(o.equals("Harry")){
                staff.remove("Charlie");
            }
         }
        
    }
}
