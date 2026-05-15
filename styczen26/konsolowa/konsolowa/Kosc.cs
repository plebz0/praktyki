using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace konsolowa
{
    public class Kosc
    {
        public static int instanceCount = 0;

        public string[] tabelOfPhotos = { "kosc0.png", "kosc1.png", "kosc2.png", "kosc3.png", "kosc4.png", "kosc5.png", "kosc6.png" };

        public int valueOfDice;

        public int idOfPhoto;

        public bool isDiceAvilable = false;

        public Kosc(int valueOfDice)
        {
            if (valueOfDice < 1 || valueOfDice > 6)
            {
                valueOfDice = 0;
            }

            this.valueOfDice = valueOfDice;

            idOfPhoto = valueOfDice;

            isDiceAvilable = true;

            instanceCount++;
        }
        public Kosc()
        {
            Random random = new Random();
            int roll = random.Next(1, 7);

            valueOfDice = roll;
            idOfPhoto = roll;


            isDiceAvilable = true;
            instanceCount++;

        }

        public void RollDice()
        {
            if (isDiceAvilable) { 
            Random random = new Random();
            int roll = random.Next(1, 7);
            valueOfDice = roll;
            idOfPhoto = roll;
            }
        }

        public void blockDice()
        {
            isDiceAvilable = false;
        }
        public string getRolledValue()
        {
            if (valueOfDice == 1) return "jeden";
            if (valueOfDice == 2) return "dwa";
            if (valueOfDice == 3) return "trzy";
            if (valueOfDice == 4) return "cztery";
            if (valueOfDice == 5) return "pięć";
            if (valueOfDice == 6) return "sześć";
            return "zero";
        }
    }
}
