import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner inputMoneda = new Scanner(System.in);

        System.out.println("Conversor de Monedas Inicializado. Elige una de las siguiente opciones:");
        System.out.println("1) USD a ARS");
        System.out.println("2) ARS a USD");
        System.out.println("3) EUR a ARS");
        System.out.println("4) ARS a EUR");

        var input = inputMoneda.nextLine();


    }
}
