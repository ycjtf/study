package http;

import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import org.junit.Test;

import java.io.IOException;

@Slf4j
public class OkHttpTestCase {

    @Test
    public void t0() {
        OkHttpClient client = new OkHttpClient();
        String input = "{\n" +
                "    \"grant_type\": \"client_credentials\",\n" +
                "    \"client_id\": \"wqltestFEDEX\",\n" +
                "    \"client_secret\": \"XEDEFtestlqw1\"\n" +
                "}";

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, input);
        Request request = new Request.Builder()
                .url("https://apis-sandbox.fedex.com/oauth/token")
                .post(body)
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .build();

        System.out.println(request);
        try (Response response = client.newCall(request).execute();) {

            System.out.println(response.body());
            System.out.println(response.message());

        } catch (IOException io) {
            log.error(io.getMessage(), io);
        }
    }
}
