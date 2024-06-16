import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String caracter;
        Scanner sc = new Scanner(System.in);
        // System.out.print("\u001B[30m\u001B[42mIntroduce un nivel\u001B[0m" + " : ");
        int valorNumerico = 0;
        boolean bandera = true;

        System.out.println("Poliretos Grupo 5");
        System.out.println();
        System.out
                .println("Integrantes: Lenin Amangandi,Martin Davalos,Cesar Zapata,Sebastian Chicaiza,Kevin Palacios");
        System.out.println();

        while (bandera) {
            System.out.print("\u001B[30m\u001B[42mIntroduce un nivel\u001B[0m" + " : ");
            String numero = sc.nextLine();

            try {
                valorNumerico = Integer.parseInt(numero);
                if (valorNumerico <= 0) {
                    System.out.println("El número debe ser mayor que 0. Inténtalo de nuevo.");
                    bandera = true;
                } else {
                    bandera = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingresa un número válido.");
                bandera = true;
            }
        }
        // System.out.println("Has introducido: " + valorNumerico);

        System.out.print("\u001B[30m\u001B[42mIntroduce un caracter\u001B[0m" + " : ");
        caracter = sc.nextLine();

        System.out.println("\u001B[35mImprimir Series Numericas\u001B[0m");
        SerieNumericas serieNumerica = new SerieNumericas();
        serieNumerica.showSerie1For(valorNumerico);
        serieNumerica.showSerie2For(valorNumerico);
        serieNumerica.showSerie3For(valorNumerico);
        serieNumerica.showSerie4For(valorNumerico);

        System.out.println();
        System.out.println("\u001B[32mImprimir Serie Caracteres\u001B[0m");
        SerieCaracter serieCaracter = new SerieCaracter();
        serieCaracter.showSerieC1For(valorNumerico);

        System.out.println();
        System.out.println("\u001B[36mImprimir Figuras\u001B[0m");
        Figuras figuras = new Figuras();
        figuras.setCaracter(caracter);
        figuras.showFigura1For(valorNumerico);
        figuras.showFigura2For(valorNumerico);
        figuras.showFigura3For(valorNumerico);
        figuras.showFigura4For(valorNumerico);

        System.out.println("\u001B[35mImprimir Cadenas Caracter\u001B[0m");
        System.out.print("Por favor ingrese una frase: ");
        String frase = sc.nextLine();
        CadenaCaracteres cadenaCaracter = new CadenaCaracteres();
        cadenaCaracter.setFrase(frase);
        cadenaCaracter.showFrase1For(frase);
        cadenaCaracter.showFrase9For(frase);

        System.out.println();
        System.out.println("\u001B[33m Imprimir Arrays \u001B[0m");
        Arrays array = new Arrays();

        System.out.println();
        System.out.println("\u001B[31mImprimir Loading\u001B[0m");
        Loading loading = new Loading();
        loading.showLoading1();
        loading.showLoading2();
        System.out.println();
        loading.showLoading3();
        loading.showLoading4();
        loading.showLoading5();

        Recursion recursion = new Recursion();

    }
}
