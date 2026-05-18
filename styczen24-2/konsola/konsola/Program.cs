using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using konsola;

namespace konsola
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(Class1.countVowels("waedĄyK").ToString());
            Console.WriteLine(Class1.removeRepeatingLetters("tgt  klst"));
        }
    }
}
