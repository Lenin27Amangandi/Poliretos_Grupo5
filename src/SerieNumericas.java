public class SerieNumericas {

    public void showSerie1For(int valorNumerico) {
        int termino1, termino2, termino3;
        termino1 = 0;
        termino2 = 1;
        System.out.println();
        for (int i = 1; i <= valorNumerico; ++i) {
            if (i == 1) {
                System.out.print(termino1 + " ");
                continue;
            }
            if (i == 2) {
                System.out.print(termino2 + " ");
                continue;
            }
            termino3 = termino2 + termino1;
            termino1 = termino2;
            termino2 = termino3;
            System.out.print(termino3 + " ");
        }
    }

    public void showSerie2For(int valorNumerico) {
        int valor = 1;
        System.out.println();
        for (int i = 0; i < valorNumerico; i++) {
            System.out.print(valor + " ");
            if (i % 2 == 0) {
                valor += 2;
            } else {
                valor++;
            }
        }
    }

    public void showSerie3For(int valorNumerico) {
        int[] numeradores;
        int[] denominadores;
        numeradores = new int[valorNumerico];
        denominadores = new int[valorNumerico];
        numeradores[0] = 0;
        numeradores[1] = 1;
        denominadores[0] = 1;
        denominadores[1] = 3;
        System.out.println();
        for (int i = 2; i < valorNumerico; i++) {
            numeradores[i] = numeradores[i - 1] + numeradores[i - 2];
            denominadores[i] = denominadores[i - 1] + 2;
        }
        for (int i = 0; i < numeradores.length; i++) {
            System.out.print(numeradores[i] + "/" + denominadores[i] + "  ");
        }
    }

    public void showSerie4For(int valorNumerico) {
        int numerador1 = 0, numerador2 = 1, denominadorpar = 4;
        System.out.println();
        switch (valorNumerico) {
            case 1:
                System.out.print("0/2 ");
                break;
            case 2:
                System.out.print("0/2 " + "1/4 ");
                break;
            default:
                System.out.print("0/2 " + "1/4 ");
                for (int i = 0; i < valorNumerico - 2; i++) {
                    int numarador3 = numerador1 + numerador2;
                    denominadorpar += 2;
                    System.out.print(numarador3 + "/" + denominadorpar + " ");
                    numerador1 = numerador2;
                    numerador2 = numarador3;
                }
                break;
        }
    }

}
