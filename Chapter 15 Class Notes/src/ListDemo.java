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

    }
}
