import java.util.Scanner;

public class digitos {

    public static void contarDigitos() {

        Scanner cantidad = new Scanner(System.in);
        int numero;
        int contador = 0;

        System.out.println("Dame un numero y yo te daré la cantidad de digitos: ");
        numero = cantidad.nextInt();
        cantidad.close();

        while (numero != 0) {
            numero = numero / 10;
            contador++;
        }

        System.out.println("Tu numero contiene: " + contador + " digitos");
    }

    public static void main(String[] args) {
        contarDigitos();
    }
}