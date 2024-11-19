import br.com.current_converter.*;

import io.github.cdimascio.dotenv.Dotenv;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Dotenv dotenv = Dotenv.load();
        Scanner scanner = new Scanner(System.in);
        HttpClient client = HttpClient.newHttpClient();

        LoadFile loadFile = new LoadFile();
        CurrencyConverter currencyConverter = new CurrencyConverter();
        JsonToObjectConverter<HttpResponseType> converterJson = new JsonToObjectConverter<HttpResponseType>();

        HttpRequest request = null;
        HttpResponse<String> response = null;
        List<Options> supportedCurrencies = null;
        HttpResponseType httpResponseType = null;


        String apiKey = dotenv.get("EXCHANGE_RATE_API_KEY");
        String fileName = "supported-currencies.json";


        supportedCurrencies = loadFile.execute(fileName);


        var isFinish = false;

        while(!isFinish) {
            for (Options options : supportedCurrencies) {
                System.out.println(options);

            }

            System.out.println("A lista acima contem os códigos das moedas (ex: BRL - para real brasileiro)");

            System.out.print("Converter de: ");
            var moedaParaConverter = scanner.next();


            System.out.print("Para: ");
            var moedaConvertida = scanner.next();


            try {
                var uri = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + moedaParaConverter + "/" + moedaConvertida + "/";
                request = HttpRequest.newBuilder().uri(URI.create(uri)).build();
                response = client.send(request, HttpResponse.BodyHandlers.ofString());
                httpResponseType = (HttpResponseType) converterJson.convert(response.body(), HttpResponseType.class);
                if (httpResponseType.getResult().equals("success")) {
                    System.out.print("Agora informe o valor em " + moedaParaConverter + " para ser convertido: ");
                    var value = scanner.nextDouble();

                    System.out.println(httpResponseType);


                    var convertedValue = currencyConverter.convertCurrency(httpResponseType.getConvertionRate(), value);

                    System.out.println("""
                         %.2f  %s =>  %.2f %s
                        """.formatted(value, httpResponseType.getBaseCode(), convertedValue, httpResponseType.getTargetCode()));

                }

                if (httpResponseType.getResult().equals("error")) {
                    System.out.println(httpResponseType.getErrorMessage());
                }

            } catch (Exception ex) {
                System.out.println("Falha ao processar informações. Favor, verificar se os codigos foram informados corretamente");

            }finally {
                System.out.println("Deseja continuar? (1 - SIM | 2 - NAO)");
                isFinish = scanner.nextInt() == 2;

            }


        }


    }
}
