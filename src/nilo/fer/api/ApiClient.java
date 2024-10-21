package nilo.fer.api;

import com.google.gson.Gson;
import nilo.fer.model.ExchangeRate;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiClient {
            public String goToSearch (String base_code, String target_code) throws IOException, InterruptedException {
                URI adress = URI.create( "https://v6.exchangerate-api.com/v6/eaf093874f4783b40b572eac/pair/"+base_code+"/"+target_code);
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder().uri(adress).build();


                HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
            return response.body();

    }
}
