import java.util.LinkedList;

/**
 * This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
    /**
     * Reverses the elements in a linked list
     *
     * @param strings the linked list to reverse
    */
    public static void reverse(LinkedList<String> strings)
    {
        LinkedList<String> reverse_strings = new LinkedList<>();
        while(strings.size() > 0){
            reverse_strings.add(strings.removeLast());
        }
        strings.clear();





        
        while(reverse_strings.size() > 0){
            strings.add(reverse_strings.removeFirst());
        }
        System.out.println(strings);
        

    }
}