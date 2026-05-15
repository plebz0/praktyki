using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using konsolowa;
namespace konsolowa
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Prosze podać wyrzuconą cyfrę");
            string valueOfFirstRoll = Console.ReadLine();
            Console.WriteLine("Pierwszy konstruktor z 1 elementem");
            Kosc kosc = new Kosc(Int32.Parse(valueOfFirstRoll));
            Console.WriteLine(Kosc.instanceCount.ToString());
            Console.WriteLine("Wyżucono: " + kosc.valueOfDice.ToString() + " " + kosc.getRolledValue());
            Console.WriteLine(kosc.tabelOfPhotos[kosc.valueOfDice].ToString());
            Console.WriteLine("Drugi konstruktor z 0 elementem");
            Kosc kosc1 = new Kosc();
            Console.WriteLine(Kosc.instanceCount.ToString());
            kosc1.RollDice();
            Console.WriteLine("Wyżucono: " + kosc1.valueOfDice.ToString() + " " + kosc1.getRolledValue());
            Console.WriteLine(kosc1.tabelOfPhotos[kosc1.valueOfDice].ToString());
            
        }
    }
}
