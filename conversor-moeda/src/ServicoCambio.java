import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class ServicoCambio {
    private final String API_KEY = "16faa6970e3a5540bac73621"; // Minha chave de API aqui.
    private final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public double converter(String moedaOrigem, String moedaDestino, double valor) {
        try {
            String urlStr = BASE_URL + API_KEY + "/latest/" + moedaOrigem;
            URL url = new URL(urlStr);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            Gson gson = new Gson();
            ExchangeRateResponse resposta = gson.fromJson(reader, ExchangeRateResponse.class);
            reader.close();

            Double taxa = resposta.conversion_rates.get(moedaDestino);

            if (taxa != null) {
                return valor * taxa;
            } else {
                System.out.println("Moeda de destino inválida.");
                return -1;
            }
        } catch (Exception e) {
            System.out.println("Erro ao acessar a API: " + e.getMessage());
            return -1;
        }
    }
}
