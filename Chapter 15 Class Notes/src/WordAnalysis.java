import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * This program checks which words in a file are not present in a dictionary.
*/
public class WordAnalysis
{
    public static void main(String[] args)
        throws FileNotFoundException
    {
        /*
         * read the dictionary and the novel
         */
        Set<String> dictionaryWords = readWords("C:/Users/amnguyen2/Desktop/data-structures-MaxNguyen5040/Chapter 15 Class Notes/src/words");
         Set<String> novelWords = readWords("C:/Users/amnguyen2/Desktop/data-structures-MaxNguyen5040/Chapter 15 Class Notes/src/throughTheLookingGlass.txt");
         //1. promt all the words that are in the novel but not the dict
         for(String word : novelWords){
            if(!dictionaryWords.contains(word)){
                System.out.println(word);
            }

         
        }
        System.out.println(novelWords);



        //print the number of unique words >3 letters
        Iterator<String> i =novelWords.iterator();
        while(i.hasNext()){
            if (i.next().length() <= 3){
                i.remove();
            }
        }
        System.out.println("unique words" + novelWords.size());
    }

    

    /**
     * Reads all words from a file.
     *
     * @param filename the name of the file
     * @return a set with all lowercased words in the file. Here, a
     * word is a sequence of upper- and lowercase letters.
    */
    public static Set<String> readWords(String filename) throws FileNotFoundException
    {
        /*
         * The implementation of the set doesn't matter; so store the reference in a variable to type Set
         */

        Set<String> words = new HashSet<>();
        Scanner in = new Scanner(new File(filename));

        //use any character other than a-z or A-Z as delimiters
        in.useDelimiter("[^a-zA-Z]+");

        while(in.hasNext()){
            /*
             * adding duplicates to a set is ignored. (so is removing elements that don't exist)
             */
            words.add(in.next().toLowerCase());
        }

        return words;

    }
}
