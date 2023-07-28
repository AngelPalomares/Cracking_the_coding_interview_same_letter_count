import java.util.Scanner;
import java.lang.StringBuilder;

class Solution {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String text = reader.nextLine();

        compress(text);
    }

    static void compress(String str)
    {
        int countConsecutive = 1; // Start the count from 1 as we already have one character

        for(int i = 0; i < str.length() - 1; i++)
        {
            if(str.charAt(i) == str.charAt(i+1))
            {
                countConsecutive++;
            }
            else
            {
                if(countConsecutive > 1)
                {
                    System.out.print(str.charAt(i));
                    System.out.print(countConsecutive);
                }
                countConsecutive = 1; // Reset the count
            }
        }

        // Handle the last set of consecutive characters
        if(countConsecutive > 1)
        {
            System.out.print(str.charAt(str.length() - 1));
            System.out.print(countConsecutive);
        }

        System.out.println(); // add a line break at the end
    }
}
