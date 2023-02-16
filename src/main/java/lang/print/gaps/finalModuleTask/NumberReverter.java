package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int aseul = number - (number / 100) * 100;
        int shua  = (aseul/10) * 10;
        int bolo = number/100;
        int pirveli = (number%10) * 100;

        System.out.println(pirveli +  shua + bolo);

    }
}
