import java.util.PriorityQueue;
import java.util.Queue;


/**
 * This program demonstrates a priority queue of to-do items. The
 * most important to-do items are removed first.
*/
public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
        // create a priority que of to do items
        Queue<WorkOrder> q = new PriorityQueue<>();

        q.add(new WorkOrder(3, "Vaccum"));
        q.add(new WorkOrder(2, "Water plants"));
        q.add(new WorkOrder(2, "make dinner"));
        q.add(new WorkOrder(2, "walk dog"));
        q.add(new WorkOrder(9, "play games"));
        q.add(new WorkOrder(1, "take practice quiz"));

        while(q.size() > 0){
            System.out.println(q.remove());
        }

    }
}
