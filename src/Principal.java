import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();

        int opcionElegida = 0;
        while (opcionElegida != 5) {
            System.out.println("""
                    Conversor de Monedas Inicializado. Elige una de las siguiente opciones:
                    1) USD a ARS
                    2) ARS a USD
                    3) EUR a ARS
                    4) ARS a EUR
                    5) Salir""");
            opcionElegida = lectura.nextInt();
            lectura.nextLine();

            switch (opcionElegida){
                case 1:
                    ConvertirMoneda.convertir("USD", "ARS", consulta, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("EUR", "ARS", consulta, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("ARS", "EUR", consulta, lectura);
                    break;
                case 5:
                    System.out.println("Saliste del programa.");
                    break;
                default:
                    System.out.println("Opción no valida.");
                    break;
            }
        }
    }
}