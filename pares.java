import java.util.Scanner;

public class pares {
    public static void main(String[] args) {
        Scanner comparacion = new Scanner(System.in);
        int dato;

        System.out.println("Introduce el numero a valorar: ");
        dato = comparacion.nextInt();
        comparacion.close();

        if (dato % 2 == 0) {
            System.out.println("Tu numero " + dato + "es PAR");
        } else {
            System.out.println("Tu numero " + dato + " es IMPAR");
        }
    }
}
