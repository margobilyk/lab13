package ua.ucu.edu.apps.task3;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.SneakyThrows;

public class BrandFetchReader {
    public static final String BRAND_FETCH_URL
    = "";

    public static final String API_KEY = "";

    @SneakyThrows
    public Company fetch(String companyName) {
        HttpClient httpClient = HttpClient.newBuilder()
        .build();

        HttpRequest httpRequest = HttpRequest.newBuilder()
        .GET()
        .uri(new URI(BRAND_FETCH_URL + companyName))
        .header("Authorization", "Bearer" + API_KEY)
        .build();

        HttpResponse<String> response
        = httpClient.send(httpRequest, BodyHandlers.ofString());
        System.out.println(response.body());

        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(response.body(), Company.class);

    }
}
