package Lektion21;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class Webseitenabruf {
    public static void main(String[] args) {
        Response response= ClientBuilder.newClient()
                .target("https://jsonplaceholder.typicode.com")
                .path("posts/1")
                .request(MediaType.APPLICATION_JSON_TYPE)
                .get();
        String s = response.readEntity(String.class);
        System.out.println(s);
    }
}
