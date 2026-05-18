using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace konsola
{
    public class Class1
    {
        public static int countVowels(String text)
        {
            if (text == null || text.Length == 0) return 0;
            String vowels = "aąeęiouóyAĄEĘIOUÓY";
            int counter = 0;
            for (int i = 0; i < text.Length; i++)
            {
                for (int j = 0; j < vowels.Length; j++)
                {
                    if (text[i] == vowels[j])
                    {
                        counter++;
                    }
                }
            }
            return counter;
        }
        public static String removeRepeatingLetters(String text)
        {
            String newText = "";
            bool isDuplicateLetter = false;
            if (text == null || text.Length == 0) return "";
            for (int i = 0; i < text.Length; i++)
            {
                for (int j = 0; j < newText.Length; j++)
                {
                    if (text[i] == newText[j])
                    {
                        isDuplicateLetter = true;
                    }
                }
                if (!isDuplicateLetter)
                {
                    newText = newText + text[i];
                }
                isDuplicateLetter = false;
            }
            return newText;
        }
    }
}
