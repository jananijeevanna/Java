package Assignment10;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Question6 {

    public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient httpClient = HttpClient.newBuilder().build();
        HttpRequest httpRequest = HttpRequest.newBuilder().GET().uri(URI.create("https://httpbin.org/get")).build();
        HttpResponse httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println(httpResponse.headers());
        System.out.println(httpResponse.statusCode());
        System.out.println(httpResponse.body());

    }

}
