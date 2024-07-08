import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Protonbus!");

        String endereco = "https://protonbusmods.com/23071982.php";

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                    .create();

            ApiResponse apiResponse = gson.fromJson(json, ApiResponse.class);
            List<BusModel> busModDataList = apiResponse.getData();

            busModDataList.forEach(System.out::println);

        } catch (IOException | InterruptedException e) {
            System.out.println("Opss... Houve algum erro ao tentar acessar API do Protonbus.");
            ;
            System.out.println(e.getMessage());
        }
    }


}