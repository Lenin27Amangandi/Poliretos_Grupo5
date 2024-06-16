public class CadenaCaracteres {

    private String frase;

    public CadenaCaracteres() {
        setFrase(frase);
    }

    public void showFrase1For(String frase) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char caracter = Character.toLowerCase(frase.charAt(i));
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }
        System.out.println("El número de vocales en la frase es: " + contador);
    }






    public void showFrase9For(String frase) {
        char[] fraseCaracteres;
        fraseCaracteres = frase.toCharArray();
        System.out.println();
        for (int i = 0; i < fraseCaracteres.length; i++) {
            if (i % 2 == 0)
                System.out.print(Character.toUpperCase(fraseCaracteres[i]));
            else
                System.out.print(Character.toLowerCase(fraseCaracteres[i]));
        }
    }

    public void setFrase(String frase) {
        if (frase == null || frase.trim().isEmpty()) {
            this.frase = "Poliretos";
        } else {
            this.frase = frase;
        }
    }

}
