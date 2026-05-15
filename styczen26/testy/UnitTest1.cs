
using konsolowa;
namespace testy

{

    public class UnitTest1
    {
        [Fact]
        public void CheckIfInRange()
        {
           
            Kosc kosc = new konsolowa.Kosc();
            kosc.RollDice();
            Assert.InRange(kosc.valueOfDice, 1, 6);
        }
        [Fact]
        public void CheckIfDiceIsAvaiable()
        {
            Kosc kosc = new konsolowa.Kosc();
            kosc.RollDice();
            int orginalValue = kosc.valueOfDice;
            kosc.blockDice();
            kosc.RollDice();
            Assert.Equal(kosc.valueOfDice, orginalValue);
        }
    }
}
