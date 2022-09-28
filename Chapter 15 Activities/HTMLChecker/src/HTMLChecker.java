import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
/**
 * Write a program that checks whether a sequence of HTML tags
 * is properly nested. For each opening tag, such as <p>, there
 * must be a closing tag </p>. A tag such as <p> may have other
 * tags inside, for example <p> <ul> <li> </li> </ul> <a> </a> </p>
 * <p>
 * The inner tags must be closed before the outer ones.
 * Your program should process a file containing tags.
 * For simplicity, assume that the tags are separated by
 * spaces, and that there is no text inside the tags.
*/
public class HTMLChecker
{
    public static void main(String[] args)
    {
        String filename = "C:/Users/amnguyen2/Desktop/data-structures-MaxNguyen5040/Chapter 15 Activities/HTMLChecker/src/TagSample2.html";

        try (Scanner in = new Scanner(new File(filename)))
        {
            // Your code goes here
            String[] tags = in.nextLine().split(" ");
            ArrayList<String> listTags = new ArrayList<>();
            for(int i = 0; i< tags.length; i++){
                listTags.add(tags[i]);
            }

            while(listTags.size() > 0){
                Boolean remove = false;
                String searchTag = listTags.get(0);
                if(String.valueOf(searchTag.charAt(1)) == "/"){
                    System.out.println("Starting / tag without a tag before it");
                    break;
                }
                else{
                    String tagname = searchTag.substring(1, searchTag.length()-1);
                    for(int u = 0; u < listTags.size(); u++){

                        if(String.valueOf(listTags.get(u).charAt(1)).equals("/")){

                            if(tagname.equals(listTags.get(u).substring(2, searchTag.length()))){ 
                                listTags.remove(0);
                                listTags.remove(u-1);
                                remove = true;
                            }
                        }
                    }
                    if(remove == false){
                        System.out.println("No matching tags");
                        break;
                    }
                    
                }
                
                
            }
            System.out.println("Valid HTML!");
                

        } catch (FileNotFoundException e)
        {
            System.out.println("Cannot open: " + filename);
        }

    }
}
