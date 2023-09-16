import java.util.Scanner;

public class circulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double radio;
        double area;

        System.out.println("Dame el radio del circulo: ");
        radio = teclado.nextDouble();
        teclado.close();

        area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es: " + area);

    }
}