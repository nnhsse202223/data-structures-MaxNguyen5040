import java.util.Scanner;
import java.awt.Color;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
/**
 * A program to add, remove, modify or print
 * student names and grades.
*/
public class Gradebook
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Map<String, String> grades = new HashMap<>();

        boolean done = false;
        while(!done)
        {
            System.out.println("A)dd R)emove M)odify P)rint Q)uit");
            String input = in.next().toUpperCase();
            if (input.equals("Q"))
            {
                done = true;
            } else if (input.equals("A"))
            {
                System.out.print("Name: ");
                String name = in.next();
                System.out.print("Grade: ");
                String grade = in.next().toUpperCase();
                grades.put(name, grade);
                System.out.println("_______");

            } else if (input.equals("R"))
            {
                System.out.print("Name: ");
                String name = in.next();
                grades.remove(name);
                System.out.println("_______");

            } else if (input.equals("M"))
            {
                System.out.print("Name: ");
                String name = in.next();
                System.out.print("Grade: ");
                String grade = in.next().toUpperCase();
                grades.put(name, grade);
                System.out.println("_______");

            } else if (input.equalsIgnoreCase("P"))
            {
                Set<String> keys = grades.keySet();
                for(String key : keys){
                    System.out.println(key+ ": " + grades.get(key));
                }
                System.out.println("_______");
            } else
                done = true;
            }
        }
    }

