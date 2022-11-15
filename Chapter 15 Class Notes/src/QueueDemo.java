import java.util.LinkedList;
import java.util.Queue;

/**
 * This program simulates a print queue. Note that documents are printed
 * in the same order as they are submitted.
*/
public class QueueDemo
{
    public static void main(String[] args)
    {
        // create a print que of strings (using a linked list)
        Queue<String> jobs = new LinkedList<>();

        // Add several print jobs
        jobs.add("Joe: Expense Report #1");
        jobs.add("Cathy: Meeting Memo");

        // Print
        System.out.println("Printing: " + jobs.remove());
        
        jobs.add("Cathy: Purchase order #1");
        jobs.add("Joe: Expense report #2");
        jobs.add("Joe: Weekly Report");

        System.out.println("Printing: " + jobs.remove());

        jobs.add("Cathy: Purchase Order #2");

        // print the rest of the jobs in the queue;
        while(jobs.size() > 0){
            System.out.println("Printing: " + jobs.remove());
        }

                            
    }
}
