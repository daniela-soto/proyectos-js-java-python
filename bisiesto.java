import java.util.Scanner;

public class bisiesto {
    int anio;
    Scanner entrada = new Scanner(System.in);

    public void entradaAnio() {
        System.out.println("Tu año es bisiesto o no?");
        System.out.println("Ingrese año a evaluar: ");
        anio = entrada.nextInt();
    }

    public void proceso() {
        if ((anio % 4 == 0) && (anio % 100 != 0 || 400 == 0)) {
            System.out.println(anio + " Sí es un año bisiesto");
        } else {
            System.out.println(anio + " No es un año bisiesto");
        }
    }

    public static void main(String[] args) {
        bisiesto fc = new bisiesto();
        fc.entradaAnio();
        fc.proceso();

    }

}
