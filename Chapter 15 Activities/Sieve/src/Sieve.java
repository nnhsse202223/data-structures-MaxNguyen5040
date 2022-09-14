import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


/**
 * A program that implements the sieve of Eratosthenes.
*/
public class Sieve
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Compute primes up to which integer?");
        int n = in.nextInt();

        // Add all numbers from 2 to n into a set
        Set<Integer> numbers = new HashSet<>();
        for(int x=2;x<n;x++){
            numbers.add(x);
        }

        //Remove
        for(int current = 2; current < n;current++){
            for(int p = 2; p <= Math.sqrt(current); p++)
            {
                if(current % p == 0)
                {
                    numbers.remove(current);
                    break;
                }
            }
        }

        System.out.println(numbers);







    }
}
