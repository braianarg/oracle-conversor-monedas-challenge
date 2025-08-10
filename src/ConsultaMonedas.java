import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMonedas {
    Monedas buscarMoneda(String codigoDeMoneda){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/8ccd29de54c0748a2b42b552/latest/"+codigoDeMoneda);

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
    }
}
