public class Figuras {

    private String caracter;

    public Figuras() {
        setCaracter(this.caracter);
    }

    public void showFigura1For(int valorNumerico) {
        for (int i = 0; i < valorNumerico; i++) {
            for (int j = 0; j < valorNumerico; j++) {
                if (i == 0 || i == valorNumerico - 1 || j == 0 || j == valorNumerico - 1) {
                    System.out.print(this.caracter + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void showFigura2For(int valorNumerico) {
        for (int i = 0; i < valorNumerico; i++) {
            for (int j = 0; j < valorNumerico; j++) {
                if (i == 0 || i == valorNumerico - 1 || j == 0 || j == valorNumerico - 1) {
                    if ((i + j) % 2 == 0) {
                        System.out.print(this.caracter + " ");
                    } else {
                        System.out.print("+ ");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void showFigura3For(int valorNumerico) {
        System.out.println();
        for (int filas = 1; filas <= valorNumerico; filas++) {
            for (int nroCaracteres = 0; nroCaracteres < filas; nroCaracteres++) {
                System.out.print(this.caracter + " ");
            }
            System.out.println();
        }
    }

    public void showFigura4For(int valorNumerico) {
        System.out.println();
        for (int filas = 1; filas <= valorNumerico; filas++) {
            for (int numEspacios = valorNumerico; numEspacios > filas; numEspacios--)
                System.out.print("  ");
            for (int numCaracter = 0; numCaracter < filas; numCaracter++)
                System.out.print(this.caracter + " ");
            System.out.println();
        }
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {

        if (caracter == null || caracter.trim().isEmpty()) {
            this.caracter = "*";
        } else {
            this.caracter = caracter;
        }
    }
}
