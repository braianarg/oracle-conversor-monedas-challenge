import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertir(String monedaBase, String monedaDestino, ConsultaMoneda consulta, Scanner lectura) {
        double cantidad;
        double cantidadConvertida;

        Moneda moneda = consulta.buscarMoneda(monedaBase, monedaDestino);
        System.out.println("La tasa es: 1 "+monedaBase+ " = "+moneda.conversion_rate()+" "+monedaDestino);
        System.out.println("Ingresa la cantidad de "+monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * moneda.conversion_rate();
        System.out.println(cantidad+" "+monedaBase+" = "+cantidadConvertida+" "+moneda.target_code());
    }
}
