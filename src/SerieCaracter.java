public class SerieCaracter {

    private int valorNumerico;

    public SerieCaracter() {
        this.valorNumerico = 0;
    }

    public void showSerieC1For(int valorNumerico) {
        char par, impar;
        par = '+';
        impar = '-';
        System.out.println();
        for (int i = 0; i < valorNumerico; i++) {
            if (i % 2 == 0)
                System.out.print(par + " ");
            else
                System.out.print(impar + " ");
        }
    }

}
