package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Title;
import br.com.alura.screenmatch.modelos.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainWithSearching {
    public static void main(String[] Args) throws IOException, InterruptedException {

        Scanner reader = new Scanner(System.in);
        System.out.println("Type the movie you're looking for: ");
        String search = reader.nextLine();

        String key = "d996cde6";
        String url = "https://www.omdbapi.com/?t=" + search + "&apikey=" + key;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        String json = response.body();
        System.out.println(json);

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        TitleOmdb myTitleOmdb = gson.fromJson(json, TitleOmdb.class);

        Title myTitle = new Title(myTitleOmdb);
        System.out.println(myTitleOmdb);
        System.out.println(myTitle);
    }
}
