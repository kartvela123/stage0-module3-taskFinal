package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int pirveli = number /1000;
        int gardamaval = number - (pirveli*1000);
        int meore = gardamaval /100;
        gardamaval = gardamaval - (meore) * 100;
        int mesame = gardamaval/10;
        int bolo = number % 10;
        System.out.println(pirveli + meore + mesame + bolo);
    }
}
