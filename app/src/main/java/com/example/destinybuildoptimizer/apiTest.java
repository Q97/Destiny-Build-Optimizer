package com.example.destinybuildoptimizer;


import com.google.gson.*;

import java.io.*;
import java.net.*;


public class apiTest {



    public static void test() {
        // Endpoint for Gjallarhorn
        String apiKey = "b464f9be0e2f4da6856e79b113629e09";
        String url = "https://www.bungie.net/platform/Destiny/Manifest/InventoryItem/1274330687/";
        URL obj;
        try {
            obj = new URL(url);


            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            con.setRequestMethod("GET");

            // Set header
            con.setRequestProperty("X-API-KEY", apiKey);

            int responseCode = con.getResponseCode();
            System.out.println("\nSending 'GET' request to Bungie.Net : " + url);
            System.out.println("Response Code : " + responseCode);

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            String response = "";

            while ((inputLine = in.readLine()) != null) {
                response += inputLine;
            }

            in.close();

            // Uses Gson - https://github.com/google/gson
            JsonParser parser = new JsonParser();
            JsonObject json = (JsonObject) parser.parse(response);

            System.out.println();
            System.out.println(json.getAsJsonObject("Response").
                    getAsJsonObject("data").
                    getAsJsonObject("inventoryItem").
                    get("itemName"));
            //Gjallarhorn
        } catch (Exception ex){}
    }
}
