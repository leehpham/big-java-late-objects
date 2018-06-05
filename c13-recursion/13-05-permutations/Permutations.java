import java.util.ArrayList;

public class Permutations
{
    public static void main(String[] args)
    {
        // Codes for testing
        ArrayList<String> pers = permutations("cream");
        for (int i = 0; i < pers.size(); i++)
        {
            System.out.printf("%d: %s\n", i+1, pers.get(i));
        }
    }

    /**
     * Gets all permutations of a given word
     * @param word the string to permute
     * @return a list of all permutations
     */
    public static ArrayList<String> permutations(String word)
    {
        // Declare an array list of string called "result" to store permutations
        ArrayList<String> result = new ArrayList<String>();

        // Solution for the simplest inputs
        // The empty string has a single permutation: itself
        if (word.length() == 0)
        {
            // Add the string to the result array list
            result.add(word);
            // Return the result array list
            return result;
        }
        else
        {
            // Loop through all character positions
            for (int i = 0; i < word.length(); i++)
            {
                // Form a shorter word by removing the ith character
                String shorter = word.substring(0, i) + word.substring(i+1);
                // Generate all permutations of the simpler word
                ArrayList<String> shorterPermutations = permutations(shorter);

                // Add the removed character to the front of
                // each permutation of the simpler word
                for (String s : shorterPermutations)
                {
                    result.add(word.charAt(i) + s);
                }
            }
        }
        // Return all permutations
        return result;
    }
}