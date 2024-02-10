package org.example;

public class CountWords
{
    /**
     * Counts the number of words in a string that end with either "g" or "s"
     * @param str -- an incoming sentence
     * @return word_count -- the number of words
     */
    public static int count(String str)
    {
        int word_count = 0;
        char last = ' ';

        for (int i=0; i<str.length(); i++)
        {
            // check if the current character is a non-letter (i.e., end of the word)
            // and the character previously read was "g" or "s"
            if (!Character.isLetter(str.charAt(i)) && (last == 'g' || last == 's'))
                word_count++;

            last = str.charAt(i);
        }

        if (last == 'g' || last == 's')
            word_count++;

        return word_count;
    }
}
